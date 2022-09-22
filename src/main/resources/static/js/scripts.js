
function calcularImc() {
  let altura = document.getElementById("altura").value;
  let peso = document.getElementById("peso").value;
  let imc = peso / (altura * altura);
  let resultado = document.getElementById("resultado");
  resultado.innerHTML = imc.toFixed(2);
}

function validarPesoYAltura() {
  let altura = document.getElementById("altura").value;
  let peso = document.getElementById("peso").value;
  let resultado = document.getElementById("resultado");
  if (altura === "" || peso === "") {
    alert("Ingresar datos en todos los campos!");
    resultado.innerHTML = "";
  } else {
    calcularImc();
  }
}