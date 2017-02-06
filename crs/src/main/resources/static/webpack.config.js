module.exports = {
  entry: "./entry.js",
  output: {
    path: __dirname,
    filename: "dist/bundle.js"
  },
  devtool: "#eval-source-map",
  devServer: {
    proxy: {
      "/api": {
        target:  "http://localhost:8888",
        ignorePath: false,
        changeOrigin: true,
        secure: false
      }
    },
    inline: true
  },
  module: {
    rules: [{
      test: /\.css$/,
      use: [
          {loader:'style-loader'},
          {
            loader:'css-loader',
            options: {
              modules: true
            }
          }
      ]
    }, {
      test: /\.js$/,
      exclude: /node_modules/,
      use: "babel-loader"
    }]
  }
};
