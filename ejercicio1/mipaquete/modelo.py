class Empleado(object):
    def __init__(self):
        self.nombre = ""
        self.apellido = ""
        self.cedula = ""
        self.comision_fija = 0
    #Métodos para gets y sets de los atributos de Empleado
    def agregar_nombre(self, n):
        self.nombre = n

    def obtener_nombre(self):
        return self.nombre

    def agregar_apellido(self, ape):
        self.apellido = ape

    def obtener_apellido(self):
        return self.apellido

    def agregar_cedula(self, ced):
        self.cedula = ced

    def obtener_cedula(self):
        return self.cedula

    def agregar_comision_fija(self, comision_f):
        self.comision_fija = comision_f

    def obtener_comision_fija(self):
        return self.comision_fija

    def presentar_datos(self):
        cadena = "Empleado.\nNombre: %s\t%s\nCedula: %s\nComision: %d" % (self.obtener_nombre(), self.obtener_apellido(), self.obtener_cedula(), self.obtener_comision_fija())
        return cadena