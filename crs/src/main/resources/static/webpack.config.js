module.exports = {
  entry: "./entry.js",
  output: {
    path: __dirname,
    filename: "dist/bundle.js"
  },
  debug: true,
  devtool: "#eval-source-map",
  devServer: {
    inline: true
  },
  module: {
    loaders: [{
      test: /\.css$/,
      loader: "style!css"
    }, {
      test: /\.js$/,
      exclude: /node_modules/,
      loader: "babel-loader"
    }]
  }
};
