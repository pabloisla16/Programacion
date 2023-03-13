package deepSpaceConquerors;

import java.util.Scanner;

/**
 *	Clase principal
 */
public class MainGame {
	
	static Scanner sc = new Scanner(System.in);
	
	/**
	 * M�todo main del juego.
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Variables
		int numberOfPlayers = 0;
		boolean finishedGame = false;
		int roundCounter = 0;
		boolean correctOption = false;
		final int SHIFTS_BY_PLAYERS = 2;
		int turnPlayer;
		boolean skipedTurn = false;
		int player;
		
		
		do {
			try {
				System.out.println("�Cu�ntos jugadores van a participar? [Introduzca el n�mero de jugadores]");
				numberOfPlayers = Integer.parseInt(sc.nextLine());
				// Si el n�mero de jugadores es menor que 2 y mayor que 4 la opci�n es incorrecta.
				// Si la opci�n es correcta, continuamos.
				if (numberOfPlayers < 2 || numberOfPlayers > 4) {
					System.out.println("El n�mero m�nimo de jugadores es 2 y el m�ximo 4");
					correctOption = false;
				}
				else {
					correctOption = true;
				}
			} catch(NumberFormatException e) {
				System.out.println("ERROR: Tienes que introducir un n�mero.");
			}
		} while (!correctOption);
		
		// Creamos el tablero.
		Board board = new Board(numberOfPlayers);
		// A�adimos los jugadores al array.
		board.addPlayers();
		// Decidimos quien empieza.
		player = board.decideWhoStarts();
		// A�adimos lo planetas al array;
		board.addPlanets();
		// Imprimimos los jugadores.
		board.printPlayers();
		// Asignamos los planetas a los jugadores.
		board.assignPlanetsToPlayers();
		
		// Se repite mientras el juego no haya terminado.
		while(!finishedGame) {
			// Aumentamos el contador de rondas.
			roundCounter += 1;
			System.out.printf("Ronda %d \n", roundCounter);
			skipedTurn = false;
			
			// Esto lo hacemos para que jugador tenga 2 turnos. Si el jugador decide saltar su turno la variable skipedTurn se vuelve true.
			for (turnPlayer = 0; turnPlayer < SHIFTS_BY_PLAYERS && !skipedTurn; turnPlayer++) {
				System.out.printf("Turno del jugador %s \n", board.getPlayersName(player));
				board.generateDeckOfShips();
				skipedTurn = gameMenu(board, player);	
			}
			
			player = ++player % board.getPlayers().length;
			// Comprobamos si el jugador todav�a tiene planetas.
			board.checkIfPlayerHavePlanets();
			// Hacemos que cada ronda nazcan nuevas personas.
			board.populationBirth();
			// Comprobamos si el juego ha finalizado.
			board.checkFinishedGame(board.checkEliminatedPlayers());
		}
		
		
	}
	
	/**
	 * M�todo que muestra el men� del juego.
	 * @param board - Tablero
	 * @param player - Posici�n del jugador en el array de jugadores.
	 * @return skipedTurn - Devuelve un boolean para saber si el jugador ha pasado turno.
	 */
	public static boolean gameMenu(Board board, int player) {
		int selectedOption;
		boolean skipedTurn = false;
		
		// Se repite hasta que el jugador introduzca una opci�n correcta.
		
		try {
			System.out.println("1. Comprar cartas de nave.");
			System.out.println("2. Comprar cartas de construcci�n.");
			System.out.println("3. Coger carta del mazo de materias primas.");
			System.out.println("4. Construir.");
			System.out.println("5. Mover nave de un planeta a otro.");
			System.out.println("6. Atacar.");
			System.out.println("7. Transportar carga.");
			System.out.println("8. Transportar personas.");
			System.out.println("9. Mejorar una nave.");
			System.out.println("10. Reparar.");
			System.out.println("11. Mostrar informaci�n de los planetas.");
			System.out.println("12. Pasar turno.");
			System.out.println("Introduzca la opci�n que desee hacer: ");
			
			selectedOption = Integer.parseInt(sc.nextLine());
			
			switch(selectedOption) {
			case 1:
				board.buyShipCard(player);
				skipedTurn = false;
				break;
			case 2:
				board.buyConstructionCard(player);
				skipedTurn = false;
				break;
			case 3:
				board.takeACardFromMaterialDeck(player);
				skipedTurn = false;
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				board.attackTarget(player);
				skipedTurn = false;
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			case 9:
				
				break;
			case 10:
				
				break;
			case 11:
				board.printPlanets();
				skipedTurn = false;
				break;
			case 12:
				skipedTurn = true;
				break;
			}
		} catch (NumberFormatException e) {
			System.out.println("ERROR: Tienes que introducir un n�mero.");
		}
		return skipedTurn;
		
	}

}
