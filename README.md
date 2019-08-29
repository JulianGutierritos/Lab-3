Se deberían agregar errores cuando: la tarifa, la edad o los días de antelación son un número negativo.

| Número | Clase de equivalencia. | Resultado |
|--------|-------|------|
| 1    | menor a 18 y superior a 20 días de antelación  |   20% descuento |
| 2    | menor 18 y menor o igual a 20 días de antelación    | 5% descuento   |
| 3     | mayor a 65 y superior a 20 días de antelación    | 23% descuento| 
| 4 | mayor a 65 y menor o igual a 20 días de antelación | 8% de descuento |
| 5 | entre 18 y 65 años y superior a 20 días de antelación | 15% de descuento |
| 6 | entre 18 y 65 años y menor o igual a 20 días de antelación | 0% de descuento |
| 7 | edad menor a 0 y cualquier cantidad de días | Excepción |
| 8 | cualquier edad y días menores a 0 | Excepción |
| 9 | valor de tarifa negativo | Excepción


| Caso | Tarifa Base | Días de Antelación  | Edad | Resultado esperado|
|--------|-------|------|-------|------|
| 1 | 100 | 25 | 17 | 80 |
| 2 | 100 | 18 | 17 | 95 |
| 3 | 100 | 25 | 70 | 77 |
| 4 | 100 | 17 | 70 | 92 |
| 5 | 100 | 25 | 21 | 85 |
| 6 | 100 | 17 | 21 | 100|
| 7 | 100 | 20 | -2 | ExcepcionParametrosInvalidos |
| 8 | 100 | -2 | 20 | ExcepcionParametrosInvalidos |

Caso 1 -> edad = 17, 18 ; días de antelación = 20, 21 

Caso 2 -> edad = 17, 18 ; días de antelación = 20 , 21 

Caso 3 -> edad = 65, 66 ; días de antelación = 20, 21

Caso 4 -> edad = 65, 66 ; días de antelación = 20 , 21

Caso 5 -> edad = 17, 18, 65, 66 ; días de antelación = 20 , 21 

Caso 6 -> edad = 17, 18, 65, 66 ; días de antelación = 20 , 21

Caso 7 -> edad = -1, 0 

Caso 8 -> días de antelación = -1 , 0 

Caso 9 -> valor de tarifa = -1 , 0


Algunos casos de prueba no funcionaron, porque el código tiene algunos errores. Entre estos encontramos que cuando los días de antelación son 20, ningún descuento por edad aplica y, además, la clase de excepciones no se encuentrá implementa, haciendo que los casos donde deberían dar excepción, se completen normalmente.
 
