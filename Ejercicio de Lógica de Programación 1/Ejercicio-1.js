// funcion creada para optener los numeros del usuario mediante prompt, returnando una lista con los numeros del usuario
function getNumbers () {

    const quantityNumbers = 3;
    const arrNumber = [];

    while (arrNumber.length < quantityNumbers){
    
        let input = prompt("Ingrese el numero: " + (arrNumber.length + 1));
        parseInt(input);

        if (isNaN(input) || input == "" || input == null){

            console.log("Ingrese un valor valido");
        } else {

            console.log(input)
            arrNumber.push(input);
        }   
    }

    console.log(arrNumber);
    return (arrNumber);
}

//Recibe una lista de numeros, Retorna la lista ordenada de mayor a menor

function arrSort (arrNumber) {

    arrNumber = arrNumber.sort(function (a, b) {return b - a;});
    return (arrNumber);
}

// Recibe una lista de numeros y un id del html, genera un container en el html justo en el id pasado y en ese mismo container genera las cards de los numeros

function cardNumbers (arrNumber, id) {

    const containerCard = document.getElementById(id);

    arrNumber.map((number) => {

        const cardNumber = document.createElement("div");
        cardNumber.classList.add("card-number")

        const textNumber = document.createElement("p");
        textNumber.textContent = number;
        
        cardNumber.append(textNumber);
        containerCard.append(cardNumber);
    });
}

// flujo del script 

let arrNumber = getNumbers();
arrNumber = arrSort(arrNumber);

cardNumbers(arrNumber, "order-numbers");
cardNumbers(arrNumber.reverse(), "order-numbers-reverse");



