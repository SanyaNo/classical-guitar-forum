var webpack = require('webpack');
var path = require('path');

module.exports = {
  entry: {
	  //the list of folders contains a single .js file to which all the components are transpiled
    //src corresponds with the component tree src folder
    home: './src/home.js',
    commentsList: './src/comment/tab/comments-list.js',
    offerSending: './src/offersending/offer-sending.js',
    requestSearch: './src/request-search.js',
    management: './src/management.js',
    agentPermissions: './src/administration/agent-permissions.js',
    validationManagement: './src/administration/validation/validation-management.js',
    prioritization: './src/administration/prioritization/prioritization.js',
    roleManagement: './src/administration/roles/role-management.js',
	   payment: './src/payment/payment.js',
    runAs: './src/run-as.js',
    documents: './src/document/documents.js'
  },
  output: {
    //I should have a js folder in the webapp folder in order for this to work
    path: '../../../src/main/webapp/js/',
    filename: '[name].js'
  },
  module: {
    loaders: [
      {
        test: /\.jsx?$/,
        include: [
          path.resolve(__dirname, './src')
        ],
        loader: 'babel',
        query: {
          presets: ['es2015', 'react'] //here we specify the dialect in this case the jsx and the react framework.
        }
      }
    ]
  }
};
