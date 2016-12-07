package com.classical.guitar;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.realm.text.PropertiesRealm;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.authc.AnonymousFilter;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.filter.authc.UserFilter;
import org.apache.shiro.web.filter.authz.RolesAuthorizationFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.AbstractShiroFilter;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.security.web.authentication.logout.LogoutFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class SecurityConfig extends WebMvcConfigurerAdapter {
	
	//Shiro
	
	@Bean(name = "shiroFilter")
	public AbstractShiroFilter shiroFilter() throws Exception {
	    ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
	    Map<String, String> filterChainDefinitionMapping = new HashMap<>();
	    filterChainDefinitionMapping.put("/api/health", "authc,roles[guest],ssl[8443]");
	    filterChainDefinitionMapping.put("/login", "authc");
	    filterChainDefinitionMapping.put("/logout", "logout");
	    shiroFilter.setFilterChainDefinitionMap(filterChainDefinitionMapping);
	    shiroFilter.setSecurityManager(securityManager());
	    shiroFilter.setLoginUrl("/login");
	    Map<String, Filter> filters = new HashMap<>();
	    filters.put("anon", new AnonymousFilter());
	    filters.put("authc", new FormAuthenticationFilter());
	    LogoutFilter logoutFilter = new LogoutFilter("/login?logout");
	    filters.put("logout", logoutFilter);
	    filters.put("roles", new RolesAuthorizationFilter());
	    filters.put("user", new UserFilter());
	    shiroFilter.setFilters(filters);
	    return (AbstractShiroFilter) shiroFilter.getObject();
	}

	@Bean(name = "securityManager")
	public DefaultWebSecurityManager securityManager() {
	    DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
	    securityManager.setRealm(realm());
	    return securityManager;
	}

	@Bean(name = "realm")
	@DependsOn("lifecycleBeanPostProcessor")
	public PropertiesRealm realm() {
	    PropertiesRealm propertiesRealm = new PropertiesRealm();
	    propertiesRealm.init();
	    return propertiesRealm;
	}

	@Bean
	public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
	    return new LifecycleBeanPostProcessor();
	}
}
