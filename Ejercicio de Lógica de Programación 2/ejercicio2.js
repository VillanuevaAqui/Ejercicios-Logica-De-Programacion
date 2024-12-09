
//Funcion encargada de validar y obtener los grados Celsius. Retorna los grados celcius

function getDegreesCelsius() {

    let degreesCelsius;

    while (isNaN(degreesCelsius) || degreesCelsius === "" || degreesCelsius === null) {

        let degreesCelsius = parseInt(prompt("Ingrese los grados Celsiuos: "));

        if (!(isNaN(degreesCelsius) || degreesCelsius === "" || degreesCelsius === null)){

            console.log(degreesCelsius);
            return (degreesCelsius);
        }

        alert("Ingrese un dato valido");
    }
}

//Encargada de hacer las conversiones de grados Celsius a Fanrenheit y Kelvin. Retorna un array con dichos valores

function degreesConverter (degreesCelsius) {

    const degreesFanhrenheit = (degreesCelsius * 9/5) + 32;
    const degreesKelvin = degreesCelsius + 273.15 
    
    return ([degreesFanhrenheit, degreesKelvin]);
}

// Funcion encargada de generar en el dom un div con 2 p con las conversiones respectivasd de grados Fanrenheit y Kelvin


function cardGenerator(degreesFanhrenheit, degreesKelvin) {

    const mainContainer = document.getElementById("main-container");
    const containerDegreesConverter = document.createElement("div");
    containerDegreesConverter.classList.add("container-degrees-converter");

    const textFanhrenheit = document.createElement("p");
    const textKelvin = document.createElement("p");

    textFanhrenheit.textContent = `Grados Fanhrenheit: ${degreesFanhrenheit}`;
    textKelvin.textContent = `Grados Kelvin: ${degreesKelvin}`;

    containerDegreesConverter.append(textFanhrenheit, textKelvin);
    mainContainer.appendChild(containerDegreesConverter);
}

//Flujo de la logíca 

let degrees = degreesConverter(getDegreesCelsius());
cardGenerator(degrees[0], degrees[1]);

