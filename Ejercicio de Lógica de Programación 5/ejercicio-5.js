
//

function getNumbers() {

    let number = document.getElementById("number").value;
    number = parseInt(number);

    if (isNaN(number) || number === "" || number === null || number < 1 || number % 1 !== 0) {

        alert("Ingrese un numero valido");
        return 0

    } else {

        return (number);
    }
}

function compare(number, numberOriginal) {

    if (number === numberOriginal) {

        return true
    }

    return false
}

function randomNumberGenerator(max) {

    return Math.floor(Math.random() * max);
}

function cardDialog(text) {

    const answer = document.getElementById("answer");
    const dialog = `<div class = "container-answer">
                        <p>${text}</p>
                    </div>`;

    answer.innerHTML = dialog
}

const numberSecret = randomNumberGenerator(100);
console.log(numberSecret)

const formNumbers = document.getElementById("form-numbers");
formNumbers.addEventListener("submit", (event) => {

    event.preventDefault();

    number = getNumbers();
    const good = compare(number, numberSecret)
    if (good){

        cardDialog("Felicidades, acertaste")
    } else {
        cardDialog("Intenta otra vez")
    }

});
