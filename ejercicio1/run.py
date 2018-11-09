from mipaquete.modelo import *
e = Empleado()
e.agregar_nombre("luis")
e.agregar_apellido("Benitez")
e.agregar_cedula("1110001")
e.agregar_comision_fija(5000)
print(e.presentar_datos())
