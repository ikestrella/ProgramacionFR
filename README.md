# **Programación Funcional y Reactiva**

## Trabajo de consulta
## _Higher Order Functions_
Uno de los métodos de integración numérica se denomina como Simpson 1/3. Ese método estable lo siguiente:

![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/535358e7-55b4-4aa8-a3b6-aef0c39ba446)

En donde:

![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/94b1a64a-d824-4652-89eb-869ce2e54db2)

## 1. Crear una función con nombre (integración) que use el método de Simpson para calcular el valor aproximado de cualquier función . Se recomienda analizar lo siguiente:
Para poder implementar el método de Simpson en código, se definió una función llamada Integral que nos da una como resultado una aproximación de la integración de la función dada.

![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/e894d5d5-e01f-4b54-92c4-6aa7670462a3)


### 1.1 El tipo de dato que devolverá la función integración.
El tipo de dato que devuelve esta función definida es una valor de tipo Double, como lo indica la función.

### 1.2 ¿Cuáles son los parámetros que recibe la función?
Esta función definida recibe tres parámetros, como primer parámetro vemos la función que se va a integrar, la cual es una función lambda; como segundo y tercer parámetro se recibe los limites en el cual a es el limite inferior y b es el limite superior. 

## 2. Aproxima el valor de las siguientes integrales definidas usando la función integración creada en el paso 1.

![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/1388afbd-bff3-47d6-8617-9d3df70ae153)

### 2.1 Integral 1: 
![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/de6fb7bc-3dc2-488b-8087-9cfd764a617b)

Resultado:

![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/8db57ccf-933e-46f2-8324-acb7ead307cf)

### 2.2 Integral 2: 
![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/e9954535-ffb5-473d-b3e1-f4c04dd7c10c)

Resultado:

![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/4f8069e7-c4d2-4586-8624-190b21b258b8)

### 2.3 Integral 3: 
![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/11414e4e-9691-4bc4-aa49-7376bdabf9c4)

Resultado:

![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/caae3852-e53a-4a77-a7ca-4f178b962cbd)

### 2.4 Integral 4: 
![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/8436b80a-787d-4059-8569-4be3b3f3aa4f)

Resultado:

![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/82958b86-993c-49ee-8747-01f001000a99)

### 2.5 Integral 5: 
![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/7b7a4683-2c9d-4d15-b893-a52cc6a5d2a4)

Resultado:

![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/3a346986-dd15-43a5-833f-3cc6e1606555)

### 2.6 Integral 6: 
![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/efecdfa1-1ee5-4f27-a1f7-f75d3913de07)

Resultado:

![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/3457d5a8-8e08-48d9-8d7a-6468fc4a738f)

### 2.7 Integral 7:
![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/de31b65b-bcdd-4e40-9ca8-e889bd85f13f)

Resultado:

![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/eaf8079d-30fd-4f2a-8144-fdc12c41c9b6)

 
## 3. Calcula el error que se presenta en cada aproximación. El error es igual al valor absoluto de la resta entre el valor esperado y el valor obtenido, así:

![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/b1d5a157-9e8e-43a3-a1ff-a4f172f8e7de)

Se creo una función lambda con la cual se busca calcular el error de las aproximaciones implementando el método de integración Simpson 1/3:

![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/a5f3c8a9-f62f-4b0f-ad2e-f37748f1e6bd)

Error de cada Integral:

### Integral 1:
![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/fc37bb08-a73c-4812-8a4b-e47b15b7d49d)

### Integral 2:
![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/a7ac4e6c-5428-4ac8-906d-efad9e3bf7c7)

### Integral 3:
![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/63e57731-936e-4b27-aa02-68a3c8517182)

### Integral 4:
![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/471c5b2d-bca2-4bb4-8ddd-0966351d2a02)

### Integral 5:
![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/dec65faa-3f33-48fe-99a9-6a2089ec144d)

### Integral 6:
![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/2b2347b3-00da-4fa6-901f-db11d285330b)

### Integral 7:
![image](https://github.com/ikestrella/ProgramacionFR/assets/116619952/f51a8d5f-62f1-48f0-b60b-93dc2e88f882)




