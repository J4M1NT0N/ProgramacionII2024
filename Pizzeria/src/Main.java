import ingrediente.Masa;
import ingrediente.Queso;
import ingrediente.Salsa;
import pizzeria.Pizza;
import pizzeria.PizzaChicago;
import pizzeria.PizzaNuevaYork;
import sucursal.Empleado;
import sucursal.Equipo;
import sucursal.Sucursal;
import pizzeria.PizzaPepperoni;
import pizzeria.PizzaHawaiana;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear ingredientes
        Masa masaFina = new Masa("Fina", 1);
        Salsa salsaMarinara = new Salsa("Marinara", 1);
        Queso quesoMozzarella = new Queso("Mozzarella", 1);

        Masa masaGruesa = new Masa("Gruesa", 1);
        Salsa salsaTomate = new Salsa("Tomate", 1);
        Queso quesoCheddar = new Queso("Cheddar", 1);

        // Crear pizzas
        Pizza pizzaNY = new PizzaNuevaYork("Pizza Nueva York", "Grande", 15.99, masaFina, salsaMarinara, quesoMozzarella, "Corte en triángulo");
        Pizza pizzaChicago = new PizzaChicago("Pizza Chicago", "Mediana", 18.99, masaGruesa, salsaTomate, quesoCheddar, "Masa gruesa");
        Pizza pizzaHawaiana = new PizzaHawaiana("Pizza Hawaiana", "Grande", 16.99, masaFina, salsaMarinara, quesoMozzarella, "Piña y jamón");
        Pizza pizzaPepperoni = new PizzaPepperoni("Pizza Pepperoni", "Mediana", 17.99, masaGruesa, salsaTomate, quesoMozzarella, "Pepperoni picante");

        // Crear empleados
        Empleado empleado1 = new Empleado("Juan", "Cocinero", 25000);
        Empleado empleado2 = new Empleado("Ana", "Cajero", 20000);

        // Crear equipos
        Equipo horno = new Equipo("Horno", "Operativo");
        Equipo batidora = new Equipo("Batidora", "En reparación");

        // Crear sucursal
        Sucursal sucursal = new Sucursal("Sucursal Centro", "Av. Principal 123");

        // Agregar empleados, ingredientes y equipos a la sucursal
        sucursal.agregarEmpleado(empleado1);
        sucursal.agregarEmpleado(empleado2);

        sucursal.agregarIngrediente(masaFina);
        sucursal.agregarIngrediente(salsaMarinara);
        sucursal.agregarIngrediente(quesoMozzarella);
        sucursal.agregarIngrediente(masaGruesa);
        sucursal.agregarIngrediente(salsaTomate);
        sucursal.agregarIngrediente(quesoCheddar);

        sucursal.agregarEquipo(horno);
        sucursal.agregarEquipo(batidora);

        // Agregar especialidades a la sucursal
        sucursal.agregarEspecialidad(pizzaNY);
        sucursal.agregarEspecialidad(pizzaChicago);
        sucursal.agregarEspecialidad(pizzaHawaiana);
        sucursal.agregarEspecialidad(pizzaPepperoni);

        // Menú para seleccionar tipo de pizza
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de pizza que desea pedir:");
        System.out.println("1. Pizza Nueva York");
        System.out.println("2. Pizza Chicago");
        System.out.println("3. Pizza Hawaiana");
        System.out.println("4. Pizza Pepperoni");

        int opcion = scanner.nextInt();

        Pizza pizzaSeleccionada = null;

        switch (opcion) {
            case 1:
                pizzaSeleccionada = pizzaNY;
                break;
            case 2:
                pizzaSeleccionada = pizzaChicago;
                break;
            case 3:
                pizzaSeleccionada = pizzaHawaiana;
                break;
            case 4:
                pizzaSeleccionada = pizzaPepperoni;
                break;
            default:
                System.out.println("Opción no válida, no tenmos ese tipo de pizza :(");
                break;
        }

        if (pizzaSeleccionada != null) {
            // Mostrar la preparación de la pizza seleccionada
            pizzaSeleccionada.preparar();
            pizzaSeleccionada.hornear();
            pizzaSeleccionada.cortar();
            pizzaSeleccionada.empacar();
            pizzaSeleccionada.especial();
        }

        scanner.close();
    }
}
