public class Magpie4 {
 public String getGreeting() {
  return "Hello, let's talk.";
 }
 public String getResponse(String statement){
  String response = "";
  int youpsn = findKeyword(statement, "you", 0);
  int ipsn = findKeyword(statement, "I", 0);
  if (statement.length() == 0){
   response = "Say something, please.";
  } 
  else if (findKeyword(statement, "no") >= 0){
   response = "Why so negative?";
  } else if (findKeyword(statement, "mother") >= 0|| findKeyword(statement, "father") >= 0|| findKeyword(statement, "sister") >= 0|| findKeyword(statement, "brother") >= 0){
   response = "Tell me more about your family.";
  }
  else if (youpsn >= 0 && findKeyword(statement, "me", youpsn) >= 0){
   response = YouMeStatement(statement);
  } 
  else if (ipsn >= 0 && findKeyword(statement, "you", ipsn) >= 0){
   response = IYouStatement(statement);
  } 
  else if (findKeyword(statement, "I want to", 0) >= 0){
   response = IWantToStatement(statement);
  } 
  else if (findKeyword(statement, "I want", 0) >= 0){
   response = IWantStatement(statement);
  } 
  else{
   response = getRandomResponse();
  }
  return response;
 }
 private String IWantToStatement(String statement) {
  statement = statement.trim();
  String lastChar = statement.substring(statement.length() - 1);
  if (lastChar.equals(".") || lastChar.equals("!"))
   statement = statement.substring(0, statement.length() - 1);
  int psn = findKeyword (statement, "I want to", 0);
  String restOfStatement = statement.substring(psn + 9).trim();
  return "What would it mean to " + restOfStatement + "?";
 }
 private String IWantStatement(String statement) {
  statement = statement.trim();
  String lastChar = statement.substring(statement.length() - 1);
  if (lastChar.equals(".") || lastChar.equals("!"))
   statement = statement.substring(0, statement.length() - 1);
  int psn = findKeyword (statement, "I want", 0);
  String restOfStatement = statement.substring(psn + 6).trim();
  return "Would you really be happy if you had " + restOfStatement + "?";
 }
 private String YouMeStatement(String statement) {
  statement = statement.trim();
  String lastChar = statement.substring(statement.length() - 1);
  if (lastChar.equals("."))
   statement = statement.substring(0, statement.length() - 1);
  int psnOfYou = findKeyword (statement, "you", 0);
  int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
  String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
  return "What makes you think that I " + restOfStatement + " you?";
 }
 private String IYouStatement(String statement) {
  statement = statement.trim();
  String lastChar = statement.substring(statement.length() - 1);
  if (lastChar.equals(".")){
   statement = statement.substring(0, statement.length() - 1);
  }
  int psnOfI = findKeyword (statement, "I", 0);
  int psnOfYou = findKeyword (statement, "you", psnOfI + 1);
  String restOfStatement = statement.substring(psnOfI + 1, psnOfYou).trim();
  return "Why do you " + restOfStatement + " me?";
 }
 private int findKeyword(String statement, String goal, int startPos) {
  String phrase = statement.trim();
  int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
  while (psn >= 0){
   String before = " ", after = " ";
   if (psn > 0)
   before = phrase.substring (psn - 1, psn).toLowerCase();
   if (psn + goal.length() < phrase.length())
    after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
   if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0)))
    return psn;
    psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
  }
  return -1;
 }
 private int findKeyword(String statement, String goal) {
  return findKeyword (statement, goal, 0);
 }
 private String getRandomResponse() {
  final int NUMBER_OF_RESPONSES = 4;
  double r = Math.random();
  int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
  String response = "";
  if (whichResponse == 0) {
  response = "Interesting, tell me more.";
  } 
  else if (whichResponse == 1) {
  response = "Hmmm.";
  }
  else if (whichResponse == 2) {
  response = "Do you really think so?";
  } 
  else if (whichResponse == 3) {
   response = "You don't say.";
  }
  return response;
 }
}