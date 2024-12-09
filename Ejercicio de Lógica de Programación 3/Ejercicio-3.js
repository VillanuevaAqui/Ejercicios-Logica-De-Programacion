
// Funcion que obtiene y valida el numero obtenido por el usuario. returna el numero dado por el usuario

function getNumber() {

    let number;

    while (isNaN(number) || number === "" || number === null || number < 0) {

        number = parseFloat(prompt("Ingrese un numero para saber su factorial"));

        if (isNaN(number) || number === "" || number === null || number < 0){

            alert("Ingrese un numero valido");

        } else {

            console.log(number)
            if(number == 0 || number % 1 == 0){

                return(number);
            } else {
                
                alert("El numero no es un entero")
                number = ""
            }    
        }
    }
}

// Realiza el factorial del numero ocupando recursividad. Retorna el factorial del numero

function factorial(number, count = 1, factorialnumber = 1) {

    if (count <= number) {

        factorialnumber = factorialnumber * count;
        count++;
        return factorial(number, count, factorialnumber);

    } else {

        return factorialnumber
    }
}

// Genera la contenedor con el factorial del numero

function cardGenerator(factorialnumber) {

    const mainContainer = document.getElementById("main-container");
    const cardFactorial = document.createElement("div");
    cardFactorial.classList.add("card-factorial");
    const factorial = document.createElement("p");

    factorial.textContent = `El factorial es: ${factorialnumber}`;
    cardFactorial.append(factorial);
    mainContainer.appendChild(cardFactorial);
}

const factorialnumber = factorial(getNumber());
cardGenerator(factorialnumber);