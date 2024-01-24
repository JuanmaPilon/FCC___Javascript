const convertBtn = document.getElementById('convert-btn');
const getInput = document.getElementById('number');
const getOutput = document.getElementById('output');

const numCheck = () => {
    if (getInput.value === '') {
        getOutput.innerText = "Please enter a valid number";
    } else if (getInput.value < 0) {
        getOutput.innerText = "Please enter a number greater than or equal to 1";
    } else if (getInput.value > 3999) {
        getOutput.innerText = "Please enter a number less than or equal to 3999";
    }
};


const romanTable = {
    'I': 1,
    'V': 5,
    'X': 10,
    'L': 50,
    'C': 100,
    'D': 500,
    'M': 1000
};

const numConvert = () => {
   let res = 0;
   const toUpper = getInput.value.toUpperCase();
    for (let i = 0; i < toUpper.length ; i++) {
        const actualRoman = toUpper[i];
        const actualValue = romanTable[actualRoman];
        const nextValue = romanTable[toUpper + 1];
        
//         if () {

//         }
//     }

//    getOutput.innerText = `${res}`
    }
}

convertBtn.addEventListener('click', numCheck);
convertBtn.addEventListener('click', numConvert);