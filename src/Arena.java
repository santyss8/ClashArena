import java.util.Random;

public class Arena {
    // ATRIBUTOS
    private char[][] arena;
    private int tamaño;

    // CONSTRUCTOR
    public Arena(int tamaño){
        this.tamaño = tamaño;
        if (tamaño == 1){
            arena = new char[10][10];
        } else if (tamaño == 2) {
            arena = new char[10][15];

        }else {
            arena = new char[15][30];
        }

        if (tamaño == 1){
            for (int f = 0; f < arena.length; f++){
                for (int c = 0; c < 10; c++){
                    arena[f][c] = '*';
                }
            }
        } else if (tamaño == 2) {
            for (int f = 0; f < arena.length; f++){
                for (int c = 0; c < 15; c++){
                    arena[f][c] = '*';
                }
            }


        }else {
            for (int f = 0; f < arena.length; f++){
                for (int c = 0; c < 30; c++){
                    arena[f][c] = '*';
                }
            }
        }

        // OBSTACULOS
        Random random = new Random();
        if (tamaño == 1){
            for (int i = 0; i < 4; i++){
                int filas = random.nextInt(10);
                int columnas = random.nextInt(10);
                arena[filas][columnas] = 'O';
            }


        } else if (tamaño == 2) {
            for (int i = 0; i < 6; i++){
                int filas = random.nextInt(10);
                int columnas = random.nextInt(10);
                arena[filas][columnas] = 'O';
            }

        } else {
            for (int i = 0; i < 8; i++){
                int filas = random.nextInt(10);
                int columnas = random.nextInt(10);
                arena[filas][columnas] = 'O';
            }

        }

        // POWER UP
        if (tamaño == 1){
            for (int i = 0; i < 1; i++){
                int filas = random.nextInt(10);
                int columnas = random.nextInt(10);
                arena[filas][columnas] = 'E';
            }


        } else if (tamaño == 2) {
            for (int i = 0; i <2; i++){
                int filas = random.nextInt(10);
                int columnas = random.nextInt(10);
                arena[filas][columnas] = 'E';
            }

        } else {
            for (int i = 0; i < 4; i++){
                int filas = random.nextInt(10);
                int columnas = random.nextInt(10);
                arena[filas][columnas] = 'E';
            }

        }



    }

    // METODOS
    public void mostrarArena(){
        if (tamaño == 1){
            for (int f = 0; f < arena.length; f++){
                for (int c = 0; c < 10; c++){
                    System.out.print(arena[f][c] + " ");
                }
                System.out.println();
            }
        } else if (tamaño == 2) {
            for (int f = 0; f < arena.length; f++){
                for (int c = 0; c < 15; c++){
                    System.out.print(arena[f][c] + " ");
                }
                System.out.println();
            }


        }else {
            for (int f = 0; f < arena.length; f++){
                for (int c = 0; c < 30; c++){
                    System.out.print(arena[f][c] + " ");
                }
                System.out.println();
            }
        }


    }






}
