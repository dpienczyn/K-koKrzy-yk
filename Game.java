package methody;

import java.util.Scanner;

public class Game {

    int player = 0;
    char table[][] = {
        {
            ' ',
            ' ',
            ' '
        },
        {
            ' ',
            ' ',
            ' '
        },
        {
            ' ',
            ' ',
            ' '
        }
    };;

    public void printTable() {
        System.out.println();
        System.out.println();
        System.out.println("    1 2 3");
        System.out.println("a   " + table[0][0] + "|" + table[0][1] + "|" + table[0][2]);
        System.out.println("b   " + table[1][0] + "|" + table[1][1] + "|" + table[1][2]);
        System.out.println("c   " + table[2][0] + "|" + table[2][1] + "|" + table[2][2]);
        System.out.println();
        System.out.println("Wprowadzaj do tablicy dane wpisujac: a1 c2 b3 itp");
    }

    public String downloadDataGame() {
        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        return data;
    }

    public void read() {
        System.out.println();
        System.out.println("Wprowadz dana: ");
    }

    public String transferMyData(String data) {

        if (player % 2 == 0) {
            if (data.charAt(0) == 'a' && data.charAt(1) == '1') {
                if (table[0][0] == ' ') {
                    table[0][0] = 'X';
                } else {
                    System.out.println("Wybierz inne pole");
                    player--;
                }
            }
            if (data.charAt(0) == 'a' && data.charAt(1) == '2') {
                if (table[0][1] == ' ') {
                    table[0][1] = 'X';
                } else {
                    System.out.println("Wybierz inne pole");
                    player--;
                }
            }
            if (data.charAt(0) == 'a' && data.charAt(1) == '3') {
                if (table[0][2] == ' ') {
                    table[0][2] = 'X';
                } else {
                    System.out.println("Wybierz inne pole");
                    player--;
                }
            }
            if (data.charAt(0) == 'b' && data.charAt(1) == '1') {
                if (table[1][0] == ' ') {
                    table[1][0] = 'X';
                } else {
                    System.out.println("Wybierz inne pole");
                    player--;
                }
            }
            if (data.charAt(0) == 'b' && data.charAt(1) == '2') {
                if (table[1][1] == ' ') {
                    table[1][1] = 'X';
                } else {
                    System.out.println("Wybierz inne pole");
                    player--;
                }
            }
            if (data.charAt(0) == 'b' && data.charAt(1) == '3') {
                if (table[1][2] == ' ') {
                    table[1][2] = 'X';
                } else {
                    System.out.println("Wybierz inne pole");
                    player--;
                }
            }
            if (data.charAt(0) == 'c' && data.charAt(1) == '1') {
                if (table[2][0] == ' ') {
                    table[2][0] = 'X';
                } else {
                    System.out.println("Wybierz inne pole");
                    player--;
                }
            }
            if (data.charAt(0) == 'c' && data.charAt(1) == '2') {
                if (table[2][1] == ' ') {
                    table[2][1] = 'X';
                } else {
                    System.out.println("Wybierz inne pole");
                    player--;
                }
            }
            if (data.charAt(0) == 'c' && data.charAt(1) == '3') {
                if (table[2][2] == ' ') {
                    table[2][2] = 'X';
                } else {
                    System.out.println("Wybierz inne pole");
                    player--;
                }
            }
            player++;
        } else if (player % 2 != 0) {
            if (data.charAt(0) == 'a' && data.charAt(1) == '1') {
                if (table[0][0] == ' ') {
                    table[0][0] = 'O';
                } else {
                    System.out.println("Wybierz inne pole");
                    player--;
                }
            }
            if (data.charAt(0) == 'a' && data.charAt(1) == '2') {
                if (table[0][1] == ' ') {
                    table[0][1] = 'O';
                } else {
                    System.out.println("Wybierz inne pole");
                    player--;
                }
            }
            if (data.charAt(0) == 'a' && data.charAt(1) == '3') {
                if (table[0][2] == ' ') {
                    table[0][2] = 'O';
                } else {
                    System.out.println("Wybierz inne pole");
                    player--;
                }

            }
            if (data.charAt(0) == 'b' && data.charAt(1) == '1') {
                if (table[1][0] == ' ') {
                    table[1][0] = 'O';
                } else {
                    System.out.println("Wybierz inne pole");
                    player--;
                }

            }
            if (data.charAt(0) == 'b' && data.charAt(1) == '2') {
                if (table[1][1] == ' ') {
                    table[1][1] = 'O';
                } else {
                    System.out.println("Wybierz inne pole");
                    player--;
                }

            }
            if (data.charAt(0) == 'b' && data.charAt(1) == '3') {
                if (table[1][2] == ' ') {
                    table[1][2] = 'O';
                } else {
                    System.out.println("Wybierz inne pole");
                    player--;
                }

            }
            if (data.charAt(0) == 'c' && data.charAt(1) == '1') {
                if (table[2][0] == ' ') {
                    table[2][0] = 'O';
                } else {
                    System.out.println("Wybierz inne pole");
                    player--;
                }

            }
            if (data.charAt(0) == 'c' && data.charAt(1) == '2') {
                if (table[2][1] == ' ') {
                    table[2][1] = 'O';
                } else {
                    System.out.println("Wybierz inne pole");
                    player--;
                }

            }
            if (data.charAt(0) == 'c' && data.charAt(1) == '3') {
                if (table[2][2] == ' ') {
                    table[2][2] = 'O';
                } else {
                    System.out.println("Wybierz inne pole");
                    player--;
                }
            }
            player++;
        }

        System.out.println();
        System.out.println();
        System.out.println("    1 2 3");
        System.out.println("a   " + table[0][0] + "|" + table[0][1] + "|" + table[0][2]);
        System.out.println("b   " + table[1][0] + "|" + table[1][1] + "|" + table[1][2]);
        System.out.println("c   " + table[2][0] + "|" + table[2][1] + "|" + table[2][2]);

        return data;
    }

    public String toCompare(String data) {

        if (table[0][0] == 'X' && table[0][1] == 'X' && table[0][2] == 'X') {
            System.out.println("Wygra³ krzy¿yk");
            System.exit(0);
        } else if (table[0][0] == 'O' && table[0][1] == 'O' && table[0][2] == 'O') {
            System.out.println("Wygra³o kó³ko");
            System.exit(0);
        } else if (table[0][0] == 'X' && table[1][0] == 'X' && table[2][0] == 'X') {
            System.out.println("Wygra³ krzy¿yk");
            System.exit(0);
        } else if (table[0][0] == 'O' && table[1][0] == 'O' && table[2][0] == 'O') {
            System.out.println("Wygra³o kó³ko");
            System.exit(0);
        } else if (table[1][0] == 'X' && table[1][1] == 'X' && table[1][2] == 'X') {
            System.out.println("Wygra³ krzy¿yk");
            System.exit(0);
        } else if (table[1][0] == 'O' && table[1][1] == 'O' && table[1][2] == 'O') {
            System.out.println("Wygra³o kó³ko");
            System.exit(0);
        } else if (table[2][0] == 'X' && table[2][1] == 'X' && table[2][2] == 'X') {
            System.out.println("Wygra³ krzy¿yk");
            System.exit(0);
        } else if (table[2][0] == 'O' && table[2][1] == 'O' && table[2][2] == 'O') {
            System.out.println("Wygra³o kó³ko");
            System.exit(0);
        } else if (table[0][1] == 'X' && table[1][1] == 'X' && table[2][1] == 'X') {
            System.out.println("Wygra³ krzy¿yk");
            System.exit(0);
        } else if (table[0][1] == 'O' && table[1][1] == 'O' && table[2][1] == 'O') {
            System.out.println("Wygra³o kó³ko");
            System.exit(0);
        } else if (table[0][2] == 'X' && table[1][2] == 'X' && table[2][2] == 'X') {
            System.out.println("Wygra³ krzy¿yk");
            System.exit(0);
        } else if (table[0][2] == 'O' && table[1][2] == 'O' && table[2][2] == 'O') {
            System.out.println("Wygra³o kó³ko");
            System.exit(0);
        } else if (table[0][0] == 'X' && table[1][1] == 'X' && table[2][2] == 'X') {
            System.out.println("Wygra³ krzy¿yk");
            System.exit(0);
        } else if (table[0][0] == 'O' && table[1][1] == 'O' && table[2][2] == 'O') {
            System.out.println("Wygra³o kó³ko");
            System.exit(0);
        } else if (table[0][2] == 'X' && table[1][1] == 'X' && table[2][0] == 'X') {
            System.out.println("Wygra³ krzy¿yk");
            System.exit(0);
        } else if (table[0][2] == 'O' && table[1][1] == 'O' && table[2][0] == 'O') {
            System.out.println("Wygra³o kó³ko");
            System.exit(0);
        }
        return data;
    }

    public static void main(String[] args) {
        Game k = new Game();
        k.printTable();
        for (int i = 0; i < 9; i++) {
            k.read();
            String data = k.downloadDataGame();
            String printData = k.transferMyData(data);
            String d = k.toCompare(printData);
        }

    }

}