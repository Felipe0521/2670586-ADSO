import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numero = new Scanner(System.in);
        
        Curso listaCursos[] = new Curso[100];


            int opcion = 0;
            int memoria = 100;

        while (opcion != 7) {
            System.out.println("\n\n");
            System.out.println("+----------------------------------+");
            System.out.println("|           MENU DE CURSOS         |");
            System.out.println("+----------------------------------+");
              System.out.println("|                 Memoria:"+memoria+"       |");
            System.out.println("|  1. Crear curso.                 |");
            System.out.println("|  2. Listar todos los cursos.     |");
            System.out.println("|  3. Ver detalle de curso.        |");
            System.out.println("|  4. Editar informacion de curso. |");
            System.out.println("|  5. Agregar tema a curso.        |");
            System.out.println("|  6. Eliminar curso.              |");
            System.out.println("|  7. Salir.                       |");
            System.out.println("+----------------------------------+");

            
            System.out.print("Ingrese opcion a realizar :");
            opcion = entrada_numero.nextInt();

            if (opcion == 1) {
                System.out.println("\n\n");
				System.out.println("+--------------------------------------+");
				System.out.println("+              CREAR CURSO             +");
				System.out.println("+--------------------------------------+");

                System.out.print("Ingrese codigo del curso: ");
                int codigo = entrada_numero.nextInt();

                
                // comprobar codigo no repetido //
                boolean repetido = false;
                 for (int j = 0; j < listaCursos.length; j++) {
                    
                        if (listaCursos[j] != null) {
                            if (codigo == listaCursos[j].getCodigo()) {
                                System.out.println("\n");
                                 System.out.println("+--------------------------------------------------------------+");
                                 System.out.println("| EL CODIGO INGRESADO NO ES UNICO, INGRESE UN CODIGO DIFERENTE |");
                                 System.out.println("+--------------------------------------------------------------+");
                                 repetido = true;
                
                            }
                        }
                    }
                if (repetido == false) {
                    System.out.print("Ingrese nombre del curso: ");
                    String nombre = entrada_texto.nextLine();

                    System.out.print("Ingrese area del curso: ");
                    String area = entrada_texto.nextLine();

                    System.out.print("Ingrese duracion del curso en horas: ");
                    int horas = entrada_numero.nextInt();

                    int indiceDisponible = -1;
                    for (int i = 0; i < listaCursos.length; i++) {
                
                        if (listaCursos[i] == null) {
                            indiceDisponible = i;
                            break;
                            
                        }
                        
                    }
                    if (indiceDisponible != -1) {
                        listaCursos[indiceDisponible] = new Curso(codigo, nombre, area, horas);
                        memoria--;
                    }else{
                        System.out.println("+----------------------------------------------+");
                        System.out.println("|  MEMORIA LLENA ELIMINE CURSO PARA CONTINUAR  |");
                        System.out.println("+----------------------------------------------+");
                    }
                    }

                

            }
            if (opcion == 2) {
                boolean existe = false;
                System.out.println("\n\n");
                System.out.println("+----------------------------------------+");
                System.out.println("|           LISTA DE CURSOS              |");
                System.out.println("+----------------------------------------+");

                 System.out.println("     CODIGO - AREA - HORAS");
                for (int i = 0; i < listaCursos.length; i++) {
                    if (listaCursos[i] != null) {
                        System.out.println("  =>  "+listaCursos[i].getCodigo()+"  -   "+listaCursos[i].getNombre()+"   -   "+listaCursos[i].getHoras());

                        existe = true;
                    }
                }
                if (existe == false) {
                    System.out.println("  LISTA DE CURSOS VACIA, CREA UN CURSO PARA CONTINUAR   ");
                }
            }
            if (opcion == 3) {
                System.out.println("\n\n");
				System.out.println("+--------------------------------------+");
				System.out.println("+          VER DETALLES DEL CURSO      +");
				System.out.println("+--------------------------------------+");

                
                System.out.print("Ingrese codigo del curso: ");
                int codigo = entrada_numero.nextInt();

                boolean existeCurso = false;
                for (int i = 0; i < listaCursos.length; i++) {
                    if (listaCursos[i] != null) {
                        if (codigo == listaCursos[i].getCodigo()) {
                            listaCursos[i].imprimirDetalleCurso();
                            existeCurso = true;
                        }
                    }
                }
                if (existeCurso == false) {
                     System.out.println("\n");
                     System.out.println("+---------------------------------------------------+");
                     System.out.println("| EL CODIGO INGRESADO NO CORRESPONDE A NINGUN CURSO |");
                     System.out.println("+---------------------------------------------------+");
                }
            }
            if (opcion == 4) {
                System.out.println("\n\n");
				System.out.println("+--------------------------------------+");
				System.out.println("+             EDITAR CURSO             +");
				System.out.println("+--------------------------------------+");

                 System.out.print("Ingrese codigo del curso a editar: ");
                 int codigo = entrada_numero.nextInt();
                 
                 boolean existeCurso = false;
                 for (int i = 0; i < listaCursos.length; i++) {
                    if (listaCursos[i] != null) {
                        if (codigo == listaCursos[i].getCodigo()) {
                            existeCurso = true;

                             System.out.print("Ingrese nuevo nombre del curso: ");
                             String nombre = entrada_texto.nextLine();

                             System.out.print("Ingrese nueva area del curso: ");
                             String area = entrada_texto.nextLine();

                             System.out.print("Ingrese nueva duracion del curso en horas: ");
                             int horas = entrada_numero.nextInt();

                             listaCursos[i].editarInformacionCurso(nombre,area,horas);
                        }
                    }
                 }
                 if (existeCurso == false) {
                     System.out.println("\n\n");
                     System.out.println("+---------------------------------------------------+");
                     System.out.println("| EL CODIGO INGRESADO NO CORRESPONDE A NINGUN CURSO |");
                     System.out.println("+---------------------------------------------------+");
                }
            }
            if (opcion == 5) {
                System.out.println("\n\n");
				System.out.println("+--------------------------------------+");
				System.out.println("+              AGREGAR TEMA            +");
				System.out.println("+--------------------------------------+");

                
                 System.out.print("Ingrese codigo del curso a agregar tema: ");
                 int codigo = entrada_numero.nextInt();
                 
                 boolean existeCurso = false;
                 for (int i = 0; i < listaCursos.length; i++) {
                    if (listaCursos[i] != null) {
                        if (codigo == listaCursos[i].getCodigo()) {
                            existeCurso = true;

                             System.out.print("Ingrese nuevo tema del curso: ");
                             String tema = entrada_texto.nextLine();

                             

                             listaCursos[i].agregarTema(tema);
                        }
                    }
                 }
            }
            if(opcion==6){
				System.out.println("\n\n");
				System.out.println("+--------------------------------------+");
				System.out.println("+             ELIMINAR CURSO           +");
				System.out.println("+--------------------------------------+");

				System.out.print(" => Ingrese Codigo del curso a eliminar: ");
				int codigo = entrada_numero.nextInt();

				int indiceEncontrado = -1;

				for (int i = 0; i < listaCursos.length; i++) {
					if (listaCursos[i] != null && listaCursos[i].getCodigo()==codigo) {
						indiceEncontrado = i;
					}
				}

				if (indiceEncontrado != -1) {
					
					for (int i = indiceEncontrado; i < listaCursos.length-1; i++) {
						listaCursos[i] = listaCursos[i+1];
					}
					listaCursos[ listaCursos.length-1] = null;
					memoria++;

					System.out.println("+------------------------------+");
					System.out.println("+   CURSO ELIMINADO CON EXITO  +");
					System.out.println("+------------------------------+");


				}else{
					 System.out.println("\n\n");
                     System.out.println("+---------------------------------------------------+");
                     System.out.println("| EL CODIGO INGRESADO NO CORRESPONDE A NINGUN CURSO |");
                     System.out.println("+---------------------------------------------------+");
				}
			}
            if (opcion == 7) {
                     System.out.println("\n\n");
                     
				     System.out.println("+---------------------------------------------+");
				     System.out.println("+                    SALIENDO                 +");
				     System.out.println("+---------------------------------------------+");

                     System.out.println("+---------------------------------------------+");
                     System.out.println("| GRACIAS POR UTILIZAR NUESTRO SISTEMA, ADIOS |");
                     System.out.println("+---------------------------------------------+");
            }

        }
    }
}
