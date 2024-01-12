const input = document.getElementById("check-btn");
const inputText = document.getElementById("text-input");
const resultValue = document.getElementById("result");

input.addEventListener("click", (e) => {
  const inputValue = inputText.value.trim();
  console.log(inputValue);
  if (inputValue === "") {
    alert("Please input a value");
  } else {
    checkPalindromo(inputValue);
  }
});

function checkPalindromo(inputValue) {
  let palabraLimpia = inputValue.replace(/[^a-zA-Z0-9]/g, "");
  let palabra = palabraLimpia.split("");
  palabra.reverse();
  palabra = palabra.join("");
  console.log(palabra);
  if (palabra.toLowerCase() === palabraLimpia.toLowerCase()) {
    return (resultValue.innerText = `${inputValue} is a palindrome`);
  } else {
    return (resultValue.innerText = `${inputValue} is not a palindrome`);
  }
}
