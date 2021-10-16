# Solution_ACME

#Como ejecutar la solucion

No tiene interfaz, SOLO EJECUTE EL PROGRAMA, los datos se toman del archivo test.txt (""\\src\\input\\test.txt"") y el resultado se guarda en output.txt ("\\src\\output\\output.txt").

#Estructura de solucion

La solucion utiliza los archivos .txt para el ingreso y salida de datos, sin embargo los datos estan en el formato JSON para una mejor estructura de trabajo. Utiliza la libreria gson-2.8.6 para parsear los datos, maneja 3 clases modelos, day es la clase que me permite manejar el dia, la hora de entrada y salida, Employees me permite resgitrar el nombre del empleado y la lista de los dias que trabaja (List<day>), y Outcome es la clase que me permite coleccionar el resultado de busqueda para conocer las coincidencias en el aera de trabajo (Empleado1, Empleado2, Cantidad de coincidencias).

#Estructura de test.txt
  
Para mejor comprension se muestra la estructura JSON del ingreso de datos, tome en cuenta que el ejercicio tiene mas datos.
[
  {
    "name": "Juan",
    "days": [
      {
        "name": "Lunes",
        "inicio": 12.0,
        "fin": 14.0
      },
      {
        "name": "Martes",
        "inicio": 12.0,
        "fin": 14.0
      },
      {
        "name": "Miercoles",
        "inicio": 12.0,
        "fin": 14.0
      },
      {
        "name": "Jueves",
        "inicio": 12.0,
        "fin": 14.0
      }
    ]
  }
]

#Estructura de output.txt
  
Se muestran los 3 primeros resultados, en el ejemplo subido se registran 5 Empleados y una salida de 15 resultados, siendo el total de combinacion posibles (entre 2 empleados).
[
  {
    "Employee1": "Juan",
    "Employee2": "Jose",
    "hour": 2
  },
  {
    "Employee1": "Juan",
    "Employee2": "Xavier",
    "hour": 3
  },
  {
    "Employee1": "Juan",
    "Employee2": "Adriana",
    "hour": 2
  }
]

