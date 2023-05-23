const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
})

module.exports = {
  devServer: {
    proxy: {
      '/api': {
        target: 'http://localhost:8080/', // Reemplaza con la URL de tu backend de Spring
        changeOrigin: true,
        secure: false
      }
    }
  }
};
