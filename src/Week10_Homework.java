
//Son Ngo

import javax.swing.JOptionPane;

public class Week10_Homework
{

	public static void main(String[] args)
	{
		int iNumberOfDices, iGuess, iRoll, iChoice;

		iNumberOfDices = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of dices: "));
		Dice dice = new Dice(iNumberOfDices);
		JOptionPane.showMessageDialog(null,
				String.format("You've chosen %d dices. The range is 1 - %d.", iNumberOfDices, dice.Range()));

		do
		{
			iRoll = dice.GetANumber();
			iGuess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess: "));

			while ((iGuess < 1) || (iGuess > dice.Range()))
			{
				iGuess = Integer.parseInt(JOptionPane.showInputDialog("Enter a number within range: "));
			}

			if (iGuess == iRoll)
			{
				iChoice = JOptionPane.showConfirmDialog(null,
						String.format(
								"You guessed %d. The computer rolled %d.\n Your guess is correct. Do you want to continue?",
								iGuess, iRoll),
						null, JOptionPane.YES_NO_OPTION);

			} else
			{
				iChoice = JOptionPane.showConfirmDialog(null,
						String.format(
								"You guessed %d. The computer rolled %d.\n Your guess is incorrect. Do you want to continue?",
								iGuess, iRoll),
						null, JOptionPane.YES_NO_OPTION);
			}
		} while (iChoice == JOptionPane.YES_OPTION);

		if (iChoice == JOptionPane.NO_OPTION)
		{
			JOptionPane.showMessageDialog(null, "Thanks for playing. Goodbye.");
		}
	}
}
