const input = document.getElementById("check-btn");
const inputText = document.getElementById("text-input")

input.addEventListener('click', (e) => {
    const inputValue = inputText.value.trim();
    console.log(inputValue);
    if(inputValue === ""){
        alert("Please input a value");
    } else {
        checkPalindromo(inputValue);
    }
   
});

function checkPalindromo(inputValue) {
    let palabra = inputValue.split('');
    palabra.reverse();
    palabra = palabra.join('');
    if (palabra === inputValue) {
        return alert("es pali");
    } else {
        return alert("no es pali");
    }
}