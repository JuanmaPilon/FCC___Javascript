const convertBtn = document.getElementById('convert-btn');
const getInput = document.getElementById('number');

const numCheck = () => {
    if (getInput.value === '') {
        window.alert("Please enter a valid number");
    }
};

convertBtn.addEventListener('click', numCheck);