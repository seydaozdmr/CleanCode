package Basics;

public class Comments {

    /**
     * The proper use of comments is to compensate for our failure to express ourself in code. Note that I used the word failure.
     * I meant it. Comments are always failures. We must have them because we cannot always figure out how to express ourselves without them,
     * but their use is not a cause for celebration.
     * So when you find yourself in a position where you need to write a comment, think it through and see whether there isn’t some way to
     * turn the tables and express yourself in code. Every time you express yourself in code, you should pat yourself on the back.
     * Every time you write a comment, you should grimace and feel the failure of your ability of expression.
     */

    /**
     * There are certainly times when code makes a poor vehicle for explanation. Unfortunately, many programmers have taken this to
     * mean that code is seldom, if ever, a good means for explanation. This is patently false. Which would you rather see? This:
     * // Check to see if the employee is eligible for full benefits if ((employee.flags & HOURLY_FLAG) &&
     * (employee.age > 65))
     * Or this?
     * if (employee.isEligibleForFullBenefits())
     * It takes only a few seconds of thought to explain most of your intent in code. In many cases it’s simply a matter
     * of creating a function that says the same thing as the comment you want to write.
     */
}
