// obtiene y Verifica que el dato pasado por el usuario sea valido y lo retorna

function getNumber() {

    let number;

    while (isNaN(number) || number === "" || number === null || number < 0) {

        number = parseFloat(prompt("Ingrese un numero"));

        if (isNaN(number) || number === "" || number === null || number < 1 || number % 1 !== 0){

            alert("Ingrese un numero valido");

        } else {
        
            return(number); 
        }
    }
}

//Genera la sucesion de Fibonnaci y la returna en un array

function fibonacci(number){

    const fiboArray = [0, 1];
    let fiboNumberAnterior = 0;
    let fiboNumber = 1;

    for(let i = 2; i < number; ++i){

        fiboNumber = fiboNumber + fiboNumberAnterior;
        fiboArray.push(fiboNumber); 
        fiboNumberAnterior = fiboNumber - fiboNumberAnterior ;
    }

    return(fiboArray);
}

// Genera la sucessión del array en el DOM

function cardFibo (fiboArray) {

    const mainContainer = document.getElementById("main-container")
    const fiboContainer = document.createElement("div");
    fiboContainer.classList.add("fibo-container");
    const fiboText = document.createElement("p");

    fiboText.textContent = `La sucesión de Fibonacci es: ${fiboArray}`;
    fiboContainer.appendChild(fiboText);
    mainContainer.appendChild(fiboContainer);
}

//Flujo del programa

const number = fibonacci(getNumber());
cardFibo(number);