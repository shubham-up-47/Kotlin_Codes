/*                                                     

Minesweeper (nXn OnePlayerBoardGame)  
*implement "move()" function for this game.
*Arguments passed to the function are -
-[choice = 1 meansOpenTheCell & 2 meansMarkTheCellAsFlag]
-[(x,y) = coordinatesOfTheCellAtWhichThePlayerWishesToMakeTheMove]
-[MoveFunction = returnsBoolean ("true"IfTheMoveIsFeasible||"false"IfTheMoveIsNotFeasible) & ifItIsFeasibleThen makesTheMoveByUpdatingBoard andUpdateTheGameStatus ONGOING/LOST/WON   
       

*a MarkedCell isNotAllowedToBeOpened and an OpenedCell isNotAllowedToBeMarked                        
*typeOfTilesInBoard someContainBombs(Value=-1), someAreEmpty(Value=0), someContainNo(Value=Int) whichTellsTheExactNoOfBombsThatTileIsTouching, someAreOpened(isRevealed=true) & someAreMarked(isMarked=true) 
*typeOfTilesWhilePrinting someContainBombs("*" ifLOST or "X" ifWON), someAreEmpty(" "), someAreOpened("Int") & someAreMarked("X")
*thePlayerWhoSucceedsInOpeningAllTheNonMineTiles willBeTheWinner, markingAllTheMineTilesIsNotRequired                                                                                                        
*afterEachFeasibleMove print "true" & CurrentBoard(Mine="*"/"X" if LOST/WON happens) & GameStatus(if LOST/WON happens)                                                        
 
*/                                                                                            

                                                                                                
import java.util.*


fun main()
{
    val read = Scanner(System.`in`)
    val size = read.nextInt()               // storing size of the Board
    val count = read.nextInt()              // storing count of the mines


    val game = Minesweeper(size)            // creating object of Minesweeper Class as "game"

    for(i in 0 until count)                 // setting mines(Value=-1) on Minesweeper board                                 
    game.setMine(read.nextInt(), read.nextInt())


    val n = read.nextInt()                   // storing total number of moves                                 
    for(i in 0 until n)                      // making'n'Moves & printingTheResultOfEachMove    
    {
        if(game.move(read.nextInt(), read.nextInt(), read.nextInt()))     // readTheCoordinatesForCurrentMove & callMoveFunction   
        {   println("true")
            game.displayBoard()   } 
        else 
        println("false")
        
        if(game.status != Status.ONGOINING)
        break
    }

    println(game.status)
}

                                              // Minesweeper Class having 1 variable, 1 2D Array, 5 functions & 1 Companion Object                                     
class Minesweeper(private val size: Int)                                      
{
    var status = Status.ONGOINING                                        // stores current status of game 
    private var board = Array(size) { Array(size) { MineCell() }}        // making nXn 2D Array, where each block is an object of MineCell Class, if object.value = -1                                                                                               
                
                private set                         // private setter of 2D Array property in Minesweeper Class                                                //sets up mines
    fun setMine(row: Int, column: Int) : Boolean
    {                                              
        if(board[row][column].value != MINE) 
        {   board[row][column].value = MINE         // setting mine at (row, column)
            updateNeighbours(row, column)           // updating neighbour values after setting mine
            return true    }

        return false
    }

    private fun updateNeighbours(row: Int, column: Int)              
    {                                                                    // updates the values on the neighbouring tiles of the mine
        for(i in movement)                                              // (i,j) from "movement" array helps in eightDirectionMovement forValueUpdatation
        {   for(j in movement) 
            {   if(((row+i) in 0 until size) && ((column+j) in 0 until size) && board[row+i][column+j].value != MINE)
                board[row+i][column+j].value++   }                   
                                                      }
    }
    
    private fun openNeighbours(x: Int, y: Int)              
    {                                                                   // opens the values of the neighbouring tiles of the empty tile
        board[x][y].isRevealed = true
                
        for(i in 0..7)                                                  // openingInAllEightDirections(i=0 to i=7)                         
        {  
            var xCurr = x + arr1[i]                // x Current
            var yCurr = y + arr2[i]                // y Current 
            
            while((xCurr in 0 until size) && (yCurr in 0 until size))    // inside "()"OfWhileLoop onlyConditionIsChecked    
            {  
                if(board[xCurr][yCurr].value==0 && !board[xCurr][yCurr].isRevealed && !board[xCurr][yCurr].isMarked)   // new empty tile found (other than already opened empty tiles)  
                openNeighbours(xCurr, yCurr)  
                else if(board[xCurr][yCurr].value > 0 && !board[xCurr][yCurr].isMarked)                                // number tile found  
                board[xCurr][yCurr].isRevealed = true 
 
                break   
            }
        }
    }
                           
    fun move(choice: Int, x: Int, y: Int): Boolean
    {                         // returnsBoolean ("true"IfTheMoveIsFeasible||"false"IfTheMoveIsNotFeasible) & ifItIsFeasibleThen makesTheMoveByUpdatingBoard andUpdateTheGameStatus ONGOING/LOST/WON
       if((choice==1 || choice==2) && (board[x][y].isMarked || board[x][y].isRevealed))   // accessing already visited tile
       return false           
       else if(choice==1 && board[x][y].value==MINE)                                           // mine found
       {   status = Status.LOST 
           return true   }
       else if(choice==1 && board[x][y].value==0)                                         // empty tile found
       openNeighbours(x, y)   
       else if(choice==1 && board[x][y].value > 0)                                        // number tile found           
       board[x][y].isRevealed = true   
       else if(choice==2)                                                                 // marking current tile 
       board[x][y].isMarked = true 


       var flag1 = true                                            // considering allNonMineTiles areOpened & areNotMarkedAsMine
       var flag2 = true                                            // considering all tiles are visited  
       for(i in 0 until size)     
       {   for(j in 0 until size) 
           {   if(board[i][j].value!=MINE && (board[i][j].isRevealed==false || board[i][j].isMarked==true))
               flag1 = false 
               if(board[i][j].isRevealed==false && board[i][j].isMarked==false)  
               flag2 = false   }   
                                   } 
       if(flag1==true)
       status = Status.WON
       else if(flag2==true)
       status = Status.LOST 

        
       return true
    }
 
 
    fun displayBoard()  
    {                                                                          // printing board of Minesweeper (2D Array)                                   
        board.forEach {  row -> row.forEach {  if(it.isRevealed)
                                               print("| ${it.value} |")
                                               else if (it.isMarked)
                                               print("| X |")
                                               else if (status == Status.LOST && it.value == MINE)
                                               print("| * |")
                                               else if (status == Status.WON && it.value == MINE)
                                               print("| X |")
                                               else
                                               print("|   |")   }
                         println()   }
    }


    companion object               // CompanionObjectsCreatedToStore valueAssociatedToMines & arraysWhichHelpsInDifferentDirectionMoves
    {
        const val MINE = -1
        val movement = intArrayOf(-1, 0, 1)
        val arr1 = intArrayOf(-1,  0, -1,  1,  0,  1, -1,  1)
        val arr2 = intArrayOf( 0, -1, -1,  0,  1,  1,  1, -1)
    }
}

                                      // MineCell Data Class used to store information of a mine
data class MineCell(var value: Int = 0 , var isRevealed: Boolean = false, var isMarked: Boolean = false)

                                      // storing current status of game
enum class Status                  
{   ONGOINING,
    WON, 
    LOST   }













