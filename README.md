# Word Wrap Kata

A coding kata that focuses on using TDD to break down a tricky problem into bite-sized simpler problems. [Inspired by Robert C. Martin.](https://thecleancoder.blogspot.com/2010/10/craftsman-62-dark-path.html)

## Design Vision

Many TDD katas focus on a small, independent problem, often on a pretty low abstraction level (FizzBuzz, Prime Numbers, etc.) and working with static methods and primitive types. Those katas are good as a first introduction to the mechanical steps of TDD, but they lack the context of real problem domains, where multiple abstraction levels are involved. As a result, many programmers get frustrated when trying to apply TDD in a real project, and often give up soon after.

To give you a hand with the high-level design, 2 classes are already provided with stubbed interfaces. The class `Paragraph` represents a *concept* of the *problem domain* of word processing, whereas the class `WordWrapper` is a *mechanism* of the *solution domain* (i.e. *how* to implement a word processor). From the user's perspective, the `Paragraph` provides the wordwrapping functionality, even if we don't want to bloat the class with implementation details of the word wrapping algorithm.

Usually we would instead create this design vision before and during writing the tests by applying technical empathy, which means that we take on the perspective of the caller of our code *before* implementing it. A lack of technical empathy is what would cause many programmers to implement similar functionality with static methods without proper abstractions and call them something like "StringUtils", pass around strings and call the static methods from everywhere. This creates strong coupling and low cohesion, is difficult to test and maintain, and exposes implementation details to its callers.

## Testing Multiple Abstraction Levels

The 2 concepts exist on different abstraction levels, and should be covered by unit tests of the respective abstraction level. E.g., we probably do want to add tests to ensure that a paragraph correctly wraps some example inputs. When testing the word wrapper, on the other hand, we should add more granular tests that tell us *where* something went wrong.

Where a test of the paragraph might tell us "the word wrapping of this paragraph is incorrect", a test on the word wrapper might tell us, e.g., "word wrapping is incorrect when the input is shorter than the line length limit". Additionally, the tests of the paragraph document for the programmer that a paragraph is expected to wrap lines, whereas the tests of the word wrapper document the word wrapping rules.

## Instructions

Using test-driven development (TDD), implement the methods where currently `UnsupportedOperationException` is thrown. The desired behavior is explained in the respective Javadoc comments. Both classes should be tested (you may choose in which order). Try to think of the appropriate behavior to test on each abstraction level.

___

© 2023 Raimund Krämer - Use with attribution.

Links to third party sites are included for convenience only and I am not responsible for their contents.
