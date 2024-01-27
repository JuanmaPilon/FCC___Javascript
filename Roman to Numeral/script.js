const convertBtn = document.getElementById('convert-btn');
const getInput = document.getElementById('number');
const getOutput = document.getElementById('output');

const numToRoman = (num) => {
    const romanNumerals = [
        { value: 1000, numeral: 'M' },
        { value: 900, numeral: 'CM' },
        { value: 500, numeral: 'D' },
        { value: 400, numeral: 'CD' },
        { value: 100, numeral: 'C' },
        { value: 90, numeral: 'XC' },
        { value: 50, numeral: 'L' },
        { value: 40, numeral: 'XL' },
        { value: 10, numeral: 'X' },
        { value: 9, numeral: 'IX' },
        { value: 5, numeral: 'V' },
        { value: 4, numeral: 'IV' },
        { value: 1, numeral: 'I' }
    ];

    let res = '';
    
    for (let i = 0; i < romanNumerals.length; i++) {
        while (num >= romanNumerals[i].value) {
            res += romanNumerals[i].numeral;
            num -= romanNumerals[i].value;
        }
    }
    return res;
};

const numConvert = () => {
    const inputValue = parseInt(getInput.value, 10);

    if (getInput.value === '') {
        getOutput.innerText = "Please enter a valid number";
    } else if (inputValue < 1) {
        getOutput.innerText = "Please enter a number greater than or equal to 1";
    } else if (inputValue > 3999) {
        getOutput.innerText = "Please enter a number less than or equal to 3999";
    } else {
        const romanres = numToRoman(inputValue);
        getOutput.innerText = romanres;
    }
};

convertBtn.addEventListener('click', numConvert);
