

// public class GAME {
//     private boolean left;
//     private boolean right;
//     private boolean forward;
//     private boolean backward;
//     private int topScore;
//     private String helpMenu;

//     public GAME() {
//         left = false;
//         right = false;
//         forward = false;
//         backward = false;
//         topScore = 0;
//         helpMenu = "Welcome to the game!\n" +
//                 "Controls:\n" +
//                 "Use arrow keys to move.\n" +
//                 "Press 'A' for left, 'D' for right, 'W' for forward, and 'S' for backward.\n" +
//                 "Objective:\n" +
//                 "Reach the end of the level while avoiding obstacles.\n" +
//                 "Have fun!";
//     }

//     public void setLeft(boolean left) {
//         this.left = left;
//     }

//     public void setRight(boolean right) {
//         this.right = right;
//     }

//     public void setForward(boolean forward) {
//         this.forward = forward;
//     }

//     public void setBackward(boolean backward) {
//         this.backward = backward;
//     }

//     public void updateTopScore(int score) {
//         if (score > topScore) {
//             topScore = score;
//         }
//     }

//     public int getTopScore() {
//         return topScore;
//     }

//     public String getHelpMenu() {
//         return helpMenu;
//     }

//     public static void main(String[] args) {
//         GAME game = new GAME();
//         System.out.println("Initial top score: " + game.getTopScore());
//         System.out.println("Help menu: ");
//         System.out.println(game.getHelpMenu());
//     }
// }

