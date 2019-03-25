package GameBoard;
public class Gameboard{
 public char[][] board = new char[8][8];
 public Gameboard(boolean setup){
  for(int i=0;i<board.length;i++){
   for(int j=0;j<board[0].length;j++){
    //defaults
    board[i][j]='-';  
    if(setup){
     //reds
     if((i==0 || i==2) && (j%2!=0))
      board[i][j]='r';
     if((i==1) && (j%2==0))
      board[i][j]='r'; 
     //whites
     if((i==7 || i==5) && (j%2==0))
      board[i][j]='w';
     if((i==6) && (j%2!=0))
      board[i][j]='w';
    }
   }
  }
 }
 //method to check if location is on board
 public boolean onBoard(int x, int y){
  if (x>=0 && x<8 && y>=0 && y<8)
   return true;
  return false;
 }
 public boolean move(int x, int y, boolean left){
  boolean done=false;
  done=jump(x,y);
  //if it can't jump another piece and is on board
  if(onBoard(x,y) && !done){
   //reds
   if(board[x][y]=='r'){
    //left
    if(left){
     if(onBoard(x+1,y+1) && board[x+1][y+1]=='-'){
      board[x+1][y+1]='r';
      board[x][y]='-';
      done=true;
     }
    }
    //right
    else{
     if(onBoard(x+1,y-1) && board[x+1][y-1]=='-'){
      board[x+1][y-1]='r';
      board[x][y]='-';
      done=true;
     }   
    }
   }
   //whites
   if(board[x][y]=='w'){
    //left
    if(left){
     if(onBoard(x-1,y-1) && board[x-1][y-1]=='-'){
      board[x-1][y-1]='w';
      board[x][y]='-';
      done=true;
     }
    } 
    //right
    else{
     if(onBoard(x-1,y+1) && board[x-1][y+1]=='-'){
      board[x-1][y+1]='w';
      board[x][y]='-';
      done=true;
     }   
    }
   }
   //neither
   return done;
  } 
  return done;
 }
 public boolean jump(int x, int y){
  boolean done=false;
  if(onBoard(x,y)){
   //reds
   if(board[x][y]=='r'){
    //left
    if(onBoard(x+2,y+2) && board[x+1][y+1]=='w' && board[x+2][y+2]=='-'){
     board[x][y]='-';
     board[x+1][y+1]='-';
     board[x+2][y+2]='r';
     done=true;
     jump(x+2,y+2);
    }//right
    else if(onBoard(x+2,y-2) && board[x+1][y-1]=='w' && board[x+2][y-2]=='-'){
     board[x][y]='-';
     board[x+1][y-1]='-';
     board[x+2][y-2]='r';
     done=true;
     jump(x+2,y-2);
    }
   }
   //whites
   else if(board[x][y]=='w'){
    //left
    if(onBoard(x-2,y-2) && board[x-1][y-1]=='r' && board[x-2][y-2]=='-'){
     board[x][y]='-';
     board[x-1][y-1]='-';
     board[x-2][y-2]='w';
     done=true;
     jump(x-2,y-2);
    }//right
    else if(onBoard(x-2,y+2) && board[x-1][y+1]=='r' && board[x-2][y+2]=='-'){
     board[x][y]='-';
     board[x-1][y+1]='-';
     board[x-2][y+2]='w';
     done=true;
     jump(x-2,y+2);
    }   
   }
   //neither
   return done;
  } 
  return done;
 }
 public boolean kingMe(int x, int y){
  if(onBoard(x,y)){
   //if white on king space, kings it
   if(board[x][y]=='w'&&x==0){
    board[x][y]='W';
    return true;
   }
   //if red on king space, kings it
   else if(board[x][y]=='r'&&x==7){
    board[x][y]='R';
    return true;
   }
   //if neither of the above, return false
   else if(board[x][y]=='-'){
    return false;
   }
  } 
  //returns false if not in board
  return false;
 }
 public String toString(){
  //string containing the board in proper format
  String boardPrint="";
  for(int i=0;i<board.length;i++){
   //prints each piece and space between each element
   for(int j=0;j<board[0].length;j++){
    boardPrint+=(board[i][j]+" ");
   }
   //spaces out each row
   boardPrint+="\n";
  }
  //returns board
  return boardPrint;
 }
}
