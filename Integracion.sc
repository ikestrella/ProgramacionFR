//Metodo Simpson
def Integral ( funcion:(Double)=> Double, a: Double , b: Double): Double ={
  val x = (a + b) / 2
  (b - a)*( funcion(a) + (4 * funcion(x) ) + funcion(b) ) / 6
}

val errorMetodo = (valorEsperado:Double, valorObtenido:Double)=> valorEsperado - valorObtenido

val funcion = (x: Double)=> -Math.pow(x,2) + (8 * x)  - 12
Integral(funcion,3,5)
errorMetodo(7.33,Integral(funcion,3,5))

val funcion2 = (x: Double)=> 3 * Math.pow(x,2)
Integral(funcion2,0,2)
errorMetodo(8,Integral(funcion2,0,2))

val funcion3 = (x: Double)=> x + (2 * Math.pow(x,2)) - Math.pow(x,3) + (5 * Math.pow(x,4))
Integral(funcion3,-1,1)
errorMetodo(3.333,Integral(funcion3,-1,1))

val funcion4 = (x: Double)=> (2*x +1)/(Math.pow(x,2)+x)
Integral(funcion4,1,2)
errorMetodo(1.09861,Integral(funcion4,1,2))

val funcion5 = (x: Double)=> Math.pow(Math.E,x)
Integral(funcion5,0,1)
errorMetodo(1.71828,Integral(funcion5,0,1))

val funcion6 = (x: Double)=> 1/(Math.sqrt(x-1))
Integral(funcion6,2,3)
errorMetodo(0.828427,Integral(funcion6,2,3))

val funcion7 = (x: Double)=> 1/(1+Math.pow(x,2))
Integral(funcion7,0,1)
errorMetodo(0.785398,Integral(funcion7,0,1))