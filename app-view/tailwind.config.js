/** @type {import('tailwindcss').Config} */
module.exports = {
  content: ["./src/**/*.{html,js}"],
  theme: {
    extend: {
      fontFamily: {
        body: ["Source Sans Pro", "sans-serif"],
      },
      colors: {
        primary: "#F62682",
        secondary: "#c7a17a",
      },
    },
  },
  plugins: [],
}
