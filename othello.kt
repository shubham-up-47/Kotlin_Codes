/*                                                     

Othello (8X8 TwoPlayerBoardGame) (likeBigSizeTicTacToe)
*implement "move()" function for this game.
*Arguments passed to the function are -
-[currP = symbolOfThePlayerMakingMove, oppP = symbolOfTheOpponentPlayer] 
-[(x,y) = coordinatesOfTheCellAtWhichThePlayerWishesToMakeTheMove]
-[MoveFunction = returnsBoolean ("true"IfTheMoveIsFeasible||"false"IfTheMoveIsNotFeasible) & ifItIsFeasibleThen makesTheMoveByMakingRequiredChangesInTheBoard  
   

*afterMove allThe Black/White betweenTwo White/Black (diagonally/horizontally/vertically) willBeConvertedTo White/Black         
*Black/White canMoveOnlyIf itsMoveIsCausingColourChange BlackToWhite/WhiteToBlack (FeasibleMoveAtThatCell)                                                                                                    
*if Black/White isUnableToDoMove, thenTurnWillBeTransferredTo White/Black                                                                                                                     
*AtTheEnd, PlayerCorrespondingToColourHavingMaxNoOfTiles willBeTheWinner                                                                     
*initiallyTwoBlackAndTwoWhite(Diagonally)TilesAreKeptInTheCenter        
*moveFunctionMakesMoveAtEmptyPlacesOnly                                                       


           [Making Othello]

 Player           Board            Manager
(P1, P2)       (8X8 Grid)     (1=Black, 2=White) 

 
*calling move function at (x,y) => trueThenMakeChanges or returnFalseOtherwise                                  
 
*/                                                                                            


import java.util.*                                                      

                                         
fun main()                               
{
    val read = Scanner(System.`in`)
    var P1 = 1                                        // P1 = symbol of Player1 
    var P2 = 2                                        // P2 = symbol of Player2  
                            
    val b = OthelloBoard()                            // creates "objectOfOthelloBoardClass"As"b"
                     
    var n: Int = read.nextInt()                       // reads the total number of moves (even no) 
           
    var Player1Turn = true                            // start from P1 
       
    while (n > 0)                       
    {
        val x: Int = read.nextInt()                   // reads the coordinates for current move
        val y: Int = read.nextInt()
                                                      // making current move
        var validMove: Boolean = if(Player1Turn)  b.move(P1,x,y,P2)  else  b.move(P2,x,y,P1)
 
        if(validMove)                                 // printing the result of current move         
        {   b.print() 
            Player1Turn = !Player1Turn
            n--   } 
        else 
        println("false")
    }
}

                         // OthelloBoard Class having 1 2D Array, 2 functions & 1 CompanionObject (currP=currentPlayerSymbol, oppP=opponentPlayerSymbol)                            
class OthelloBoard          
{
    private val board: Array<IntArray> = Array(8) { IntArray(8) }   // making 8X8 2D Array (initialized with zeros)    
               
    fun print()                                                
    {
        board.forEach{  row -> row.forEach{  print("$it ")  }       // printing 2D Array  
                        println()  }
    }

                                    
    fun move(currP: Int, x: Int, y: Int, oppP: Int): Boolean        
    {                                                               // trying to make the move at (x,y) by currP                             
        if(x !in 0..7 || y !in 0..7 || board[x][y]!=0)
        return false


        var validMove = false                                       // storing the result of                                                                move                
        for (i in 0..7)                                             // try toDoMoveAt(x,y) inAllEightDirections (i=0 to i=7)                         
        { 
            var count = 0                     // count the no of tiles which can be turned in current move 

            var xF = arr1[i]                  // x Factor in 'i'th
            var yF = arr2[i]                  // y Factor in 'i'th

            var xCurr = x + xF                // x Current
            var yCurr = y + yF                // y Current               
            while(xCurr in 0..7 && yCurr in 0..7)                   // traversing in direction 'i' (inside "()"OfWhileLoop onlyConditionIsChecked)     
            {                                           
                if (board[xCurr][yCurr] == oppP)                    // opposite symbol found  
                {   count++
                    xCurr += xF
                    yCurr += yF   } 
                else if (board[xCurr][yCurr] == 0 || count == 0)    // unvisited cell / no opposite symbol found 
                break
                else if(board[xCurr][yCurr] == currP)               // same symbol found i.e. feasibleMove    
                {   xCurr -= xF
                    yCurr -= yF
                    while(xCurr!= x || yCurr!=y)                    // feasibleMove so change"OppPlayerSymbols"To"CurrPlayerSymbols"InTrajectry byBackTraversal                                              
                    {   board[xCurr][yCurr] = currP                 // [ doingThis inAllEightDirections (i=0 to i=7) for (x,y) ]             
                        xCurr -= xF
                        yCurr -= yF   }

                    validMove = true
                    break   }
            }
        }

        if(validMove)
        {   board[x][y] = currP   }

        return validMove                                           // finally returnTheTruthValueOfResult                                        
    }

 
    companion object         // objectsCreatedToRegulate individualScore & eightDirectionMoves
    {
        const val P1 = 1
        const val P2 = 2
        private val arr1 = intArrayOf(-1,  0, -1,  1,  0,  1, -1,  1)
        private val arr2 = intArrayOf( 0, -1, -1,  0,  1,  1,  1, -1)
    }

    init                     // initialize the 8X8 2D Array (othello) to start the game        
    {
        board[3][3] = P1
        board[3][4] = P2
        board[4][3] = P2
        board[4][4] = P1
    }
}
 

/*

Initially 

0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 
0 0 0 1 2 0 0 0 
0 0 0 2 1 0 0 0 
0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 
0 0 0 0 0 0 0 0 

*/






 




 


