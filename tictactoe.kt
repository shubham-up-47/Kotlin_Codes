/*                                                     

TicTacToe (nXn TwoPlayerBoardGame)  
*implement "move()" function for this game.
*Arguments passed to the function are -
-[(x,y) = coordinatesOfTheCellAtWhichThePlayerWishesToMakeTheMove]
-[MoveFunction = returnsBoolean ("true"IfTheMoveIsFeasible||"false"IfTheMoveIsNotFeasible) & ifItIsFeasibleThen makesTheMoveByUpdatingBoard andUpdateTheGameStatus ONGOING/DRAW/WON   
-[turn ('X' or 'O') = symbolOfThePlayerMakingMove] 
                          
                            
*initiallyAllTilesAreEmpty & moveFunctionMakesMoveAtEmptyPlacesOnly 
*playerWhoSucceedsInPlacing'n'SymbolsOfHisType in a (Horizontal/Vertical/Diagonal) line willBeTheWinner                                                                                                         
*afterEachFeasibleMove displayCurrentBoard & printGameStatus [ONGOING(ifAllTilesAreNotFilledAndNoOneWon) or PrintDRAW(ifAllTilesAreFilledAndNoOneWon) or PrintWON(ifSomeOneWon)]                                                                                                                    
*MoveFunctionShouldToggleTheCurrentPlayer ifTheStatusIs ONGOING                                                         
             
             [Making TicTacToe]
 Player           Board            Manager
(P1, P2)       (nXn Grid)        ('X', 'O')  
                       
                           
*calling move function at (x,y) => trueThenMakeChangesInBoardAndUpdateStatus or returnFalseOtherwise                                  
                                                                     
*/                                                                                            


import java.util.*


fun main()
{
    val read = Scanner(System.`in`)
                         
    val game = TicTacToe(read.nextInt())   // takesInputAsSizeOfBoard & creates"ObjectOfTicTacToeClass"As"game"       
    val k = read.nextInt()                 // reads the total number of moves
              
    for(i in 1..k)                         // making'n'Moves & printingTheResultOfEachMove                                                     
    {
        if(game.move(read.nextInt(), read.nextInt()))      // readTheCoordinatesForCurrentMove & callMoveFunction                              
        {   println("true")
            game.displayBoard()
            println(game.status)   } 
        else 
        println("false")
        
        if(game.status != Status.ONGOING)
        break
    }
}

                                           // TicTacToe Class having 2 variables, 1 2D Array & 3 functions
class TicTacToe(private val n: Int)            
{
    private var turn = 'X'                 // symbol of current player who is making move                                               
    var status = Status.ONGOING            // stores current status of game  
    private var board = Array(n) { Array(n) {'-'} }       // making nXn 2D Array (initialized with '-')   
    
              private set                 // private setter of 2D Array property in TicTacToe Class 
    fun move(x: Int, y: Int) : Boolean
    {
        if(x !in 0 until n || y !in 0 until n || board[x][y] != '-')
        return false
        else 
        board[x][y] = turn                       // updating TicTacToe


        var flag = false


        flag = true                              // checking horizontal                        
        for(i in 0 until n)
        {   if(board[i][y] != turn)
            flag = false   } 
        if(flag)
        {   status = Status.WON
            return true   } 


        flag = true                              // checking vertical                         
        for(j in 0 until n)
        {   if(board[x][j] != turn)
            flag = false   } 
        if(flag)
        {   status = Status.WON
            return true   } 

        
        if(x == y)                                // checking left diagonal 
        {  
           flag = true                                                    
           for(i in 0 until n)
           {   if(board[i][i] != turn)
               flag = false   } 
           if(flag)
           {   status = Status.WON
               return true   } 
        }


        if(x+y == n-1)                           // checking right diagonal 
        {  
           flag = true                                              
           for(i in 0 until n)
           {   if(board[i][n-1-i] != turn)
               flag = false   } 
           if(flag)
           {   status = Status.WON
               return true   } 
        }


        flag = true                              // checking whole board                              
        for(i in 0 until n)
        {   for(j in 0 until n)
            {  if(board[i][j] == '-')
               flag = false   }   }
        if(flag)
        {   status = Status.DRAW
            return true   } 


        toggleTurn()                             // changing turn
        status = Status.ONGOING
        return true        
    }

    private fun toggleTurn() 
    {   turn = if(turn=='X') 'O' else 'X'   }               // changing turn

    fun displayBoard()                             
    {
        board.forEach {  row -> row.forEach { ch -> print("| $ch |") }    // printing 2D Array  
                         println()  }
    }
}

                                   // storing current status of game
enum class Status                 
{   ONGOING,
    DRAW,
    WON   }







    