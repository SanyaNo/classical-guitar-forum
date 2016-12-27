var webpack = require('webpack');
var path = require('path');

module.exports = {
  entry: {
	
  },
  output: {
   
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
          presets: ['es2015', 'react'] 
        }
      }
    ]
  }
};
