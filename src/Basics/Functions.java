package Basics;

public class Functions {
    /**
     * Not only is it long, but it’s got duplicated
     * code, lots of odd strings, and many strange and inobvious data types and APIs. See how
     * much sense you can make of it in the next three minutes.
     */

//    public static String testableHtml(PageData pageData, boolean includeSuiteSetup) throws Exception {
//        WikiPage wikiPage = pageData.getWikiPage();
//        StringBuffer buffer = new StringBuffer();
//        if (pageData.hasAttribute("Test")) {
//            if (includeSuiteSetup) {
//                WikiPage suiteSetup =
//                        PageCrawlerImpl.getInheritedPage(
//                                SuiteResponder.SUITE_SETUP_NAME, wikiPage
//                        );
//                if (suiteSetup != null) {
//                    WikiPagePath pagePath =
//                            suiteSetup.getPageCrawler().getFullPath(suiteSetup);
//                    String pagePathName = PathParser.render(pagePath);
//                    buffer.append("!include -setup .")
//                            .append(pagePathName)
//                            .append("\n");
//                }
//            }
//            WikiPage setup =
//                    PageCrawlerImpl.getInheritedPage("SetUp", wikiPage);
//            if (setup != null) {
//                WikiPagePath setupPath =
//                        wikiPage.getPageCrawler().getFullPath(setup);
//                String setupPathName = PathParser.render(setupPath);
//                buffer.append("!include -setup .")
//                        .append(setupPathName)
//                        .append("\n");
//            }
//        }
//        buffer.append(pageData.getContent());
//        if (pageData.hasAttribute("Test")) {
//            WikiPage teardown =
//                    PageCrawlerImpl.getInheritedPage("TearDown", wikiPage);
//            if (teardown != null) {
//                WikiPagePath tearDownPath =
//                        wikiPage.getPageCrawler().getFullPath(teardown);
//                String tearDownPathName = PathParser.render(tearDownPath);
//                buffer.append("\n")
//                        .append("!include -teardown .")
//                        .append(tearDownPathName)
//                        .append("\n");
//            }
//            if (includeSuiteSetup) {
//                WikiPage suiteTeardown =
//                        PageCrawlerImpl.getInheritedPage(
//                                SuiteResponder.SUITE_TEARDOWN_NAME,
//                                wikiPage
//                        );
//                if (suiteTeardown != null) {
//                    WikiPagePath pagePath =
//                            suiteTeardown.getPageCrawler().getFullPath (suiteTeardown);
//                    String pagePathName = PathParser.render(pagePath);
//                    buffer.append("!include -teardown .")
//                            .append(pagePathName)
//                            .append("\n");
//                }
//            }
//        }
//        pageData.setContent(buffer.toString());
//        return pageData.getHtml();
//    }

    /**
     * Eğer fonksiyon birden çok iş yapıyorsa (soyutlamalar ve controller) bu fonksiyon bir kaç parçaya
     * bölünüp refactor edilmelidir.
     * Bir fonksiyonun ilk kuralı küçük olması gerektiğidir.
     * I’ve written
     * several nasty 3,000-line abominations. I’ve written scads of functions in the 100 to 300
     * line range. And I’ve written functions that were 20 to 30 lines long. What this experience
     * has taught me, through long trial and error, is that functions should be very small.
     * Functions should hardly ever be 20 lines long.
     *
     * How short should your functions be? They should usually be shorter than Listing 3-2!
     * Indeed, Listing 3-2 should really be shortened to Listing 3-3.
     *public static String renderPageWithSetupsAndTeardowns(
     * PageData pageData, boolean isSuite) throws Exception {
     * if (isTestPage(pageData))
     *      includeSetupAndTeardownPages(pageData, isSuite);
     * return pageData.getHtml();
     * }
     *
     * FUNCTIONS SHOULD DO ONE THING. THEY SHOULD DO IT WELL.
     * THEY SHOULD DO IT ONLY.
     */

    /**
     * One Level of Abstraction per Function
     * In order to make sure our functions are doing “one thing,” we need to make sure that the
     * statements within our function are all at the same level of abstraction.
     */

    /**
     * Mixing levels of abstraction within a function is always confusing. Readers may not
     * be able to tell whether a particular expression is an essential concept or a detail.
     */

    /**
     * To include the setups and teardowns, we include setups, then we include the test page content,
     * and then we include the teardowns.
     * To include the setups, we include the suite setup if this is a suite, then we include the
     * regular setup.
     * To include the suite setup, we search the parent hierarchy for the “SuiteSetUp” page
     * and add an include statement with the path of that page.
     * To search the parent. . .
     * It turns out to be very difficult for programmers to learn to follow this rule and write
     * functions that stay at a single level of abstraction. But learning this trick is also very
     * important. It is the key to keeping functions short and making sure they do “one thing.”
     * Making the code read like a top-down set of TO paragraphs is an effective technique for
     * keeping the abstraction level consistent.
     */

    /**
     * Function Arguments
     * The ideal number of arguments for a function is
     * zero (niladic). Next comes one (monadic), followed
     * closely by two (dyadic). Three arguments (triadic)
     * should be avoided where possible. More than three
     * (polyadic) requires very special justification—and
     * then shouldn’t be used anyway.
     */

    /**
     * Common Monadic Forms
     * There are two very common reasons to pass a single argument into a function. You may be
     * asking a question about that argument, as in boolean fileExists(“MyFile”). Or you may be
     * operating on that argument, transforming it into something else and returning it. For
     * example, InputStream fileOpen(“MyFile”) transforms a file name String into an
     * InputStream return value. These two uses are what readers expect when they see a function.
     * You should choose names that make the distinction clear, and always use the two
     * forms in a consistent context. (See Command Query Separation below.)
     * A somewhat less common, but still very useful form for a single argument function,
     * is an event. In this form there is an input argument but no output argument. The overall
     * program is meant to interpret the function call as an event and use the argument to alter the
     * state of the system, for example, void passwordAttemptFailedNtimes(int attempts). Use
     * this form with care. It should be very clear to the reader that this is an event. Choose
     * names and contexts carefully.
     */

    /**
     * Flag Arguments
     * Flag arguments are ugly. Passing a boolean into a function is a truly terrible practice. It
     * immediately complicates the signature of the method, loudly proclaiming that this function
     * does more than one thing. It does one thing if the flag is true and another if the flag is false!
     */

    /**
     * Dyadic Functions
     * A function with two arguments is harder to understand than a monadic function. For example,
     * writeField(name) is easier to understand than writeField(output-Stream, name).10
     * Though the meaning of both is clear, the first glides past the eye, easily depositing its
     * meaning. The second requires a short pause until we learn to ignore the first parameter.
     * And that, of course, eventually results in problems because we should never ignore any
     * part of code. The parts we ignore are where the bugs will hide.
     * There are times, of course, where two arguments are appropriate. For example,
     * Point p = new Point(0,0); is perfectly reasonable. Cartesian points naturally take two
     * arguments. Indeed, we’d be very surprised to see new Point(0). However, the two arguments
     * in this case are ordered components of a single value! Whereas output-Stream and
     * name have neither a natural cohesion, nor a natural ordering.
     * Even obvious dyadic functions like assertEquals(expected, actual) are problematic.
     * How many times have you put the actual where the expected should be? The two arguments
     * have no natural ordering. The expected, actual ordering is a convention that
     * requires practice to learn.
     * Dyads aren’t evil, and you will certainly have to write them. However, you should be
     * aware that they come at a cost and should take advantage of what mechanims may be
     * available to you to convert them into monads. For example, you might make the
     * writeField method a member of outputStream so that you can say outputStream.
     * writeField(name). Or you might make the outputStream a member variable of the current
     * class so that you don’t have to pass it. Or you might extract a new class like FieldWriter
     * that takes the outputStream in its constructor and has a write method.
     *
     * Not: iki argüman alan methodlardan eğer argümanlar alakasız ve normal sıralamaya uygun değilse
     * birini sınıf düzeyinde extract edebilirsiniz.
     */

    /**
     * Triads
     * Functions that take three arguments are significantly harder to understand than dyads. The
     * issues of ordering, pausing, and ignoring are more than doubled. I suggest you think very
     * carefully before creating a triad.
     * For example, consider the common overload of assertEquals that takes three arguments:
     * assertEquals(message, expected, actual). How many times have you read the
     * message and thought it was the expected? I have stumbled and paused over that particular
     * triad many times. In fact, every time I see it, I do a double-take and then learn to ignore the
     * message.
     */

    /**
     * Argument Objects
     * When a function seems to need more than two or three arguments, it is likely that some of
     * those arguments ought to be wrapped into a class of their own. Consider, for example, the
     * difference between the two following declarations:
     * Circle makeCircle(double x, double y, double radius);
     * Circle makeCircle(Point center, double radius);
     * Reducing the number of arguments by creating objects out of them may seem like
     * cheating, but it’s not. When groups of variables are passed together, the way x and
     * y are in the example above, they are likely part of a concept that deserves a name of its
     * own.
     * Eğer birden çok aynı işe yönelik argümanınız varsa bunları bir sınıf içerisinde toplayabilirsiniz.
     */
    /**
     * Verbs and Keywords
     * Choosing good names for a function can go a long way toward explaining the intent of
     * the function and the order and intent of the arguments. In the case of a monad, the
     * function and argument should form a very nice verb/noun pair. For example,
     * write(name) is very evocative. Whatever this “name” thing is, it is being “written.” An
     * even better name might be writeField(name), which tells us that the “name” thing is a
     * “field.”
     */

    /**
     * This side effect creates a temporal coupling. That is, checkPassword can only be
     * called at certain times (in other words, when it is safe to initialize the session). If it is
     * called out of order, session data may be inadvertently lost. Temporal couplings are confusing,
     * especially when hidden as a side effect. If you must have a temporal coupling,
     * you should make it clear in the name of the function. In this case we might rename the
     * function checkPasswordAndInitializeSession, though that certainly violates “Do one
     * thing.”
     *
     * Eğer methodun içinde farklı bir yan etki varsa (başka bir method çağrısı gibi) bu durumda
     * bu yan etki method isminde belirtilmeli
     */

    /**
     * Output Arguments
     * Arguments are most naturally interpreted as inputs to a function. If you have been programming
     * for more than a few years, I’m sure you’ve done a double-take on an argument
     * that was actually an output rather than an input. For example:
     * appendFooter(s);
     * Does this function append s as the footer to something? Or does it append some footer
     * to s? Is s an input or an output? It doesn’t take long to look at the function signature
     * and see:
     * public void appendFooter(StringBuffer report)
     * This clarifies the issue, but only at the expense of checking the declaration of the function.
     * Anything that forces you to check the function signature is equivalent to a double-take. It’s
     * a cognitive break and should be avoided.
     * In the days before object oriented programming it was sometimes necessary to have
     * output arguments. However, much of the need for output arguments disappears in OO languages
     * because this is intended to act as an output argument. In other words, it would be
     * better for appendFooter to be invoked as
     * report.appendFooter();
     * In general output arguments should be avoided. If your function must change the state
     * of something, have it change the state of its owning object.
     */




}
