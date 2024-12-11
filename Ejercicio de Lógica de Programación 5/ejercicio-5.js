
//

function getNumbers () {

    let number;

    while (isNaN(number) || number === "" || number === null || number < 1){

        number = parseInt(prompt("Ingrese el numero: "));

        if (isNaN(number) || number === "" || number === null || number < 1 || number % 1 !== 0){

            alert("El numero ingresado no es valido");
        } else {

            return (number);
        }
    }
}

function compare (number, numberOriginal) {

    if (number === numberOriginal) {

        return "Felicidades acertaste"
    }

    return ("Intenta de nuevo");
}

function randomNumberGenerator (max){

    return Math.floor(Math.random() * max)    
}

function cardDialog() {

    const mainContainer = document.getElementById("main-container");
    const dialogContainer = document.createElement("div");
    const dialog = document.createElement("p");

    dialog.textContent = 0;


}