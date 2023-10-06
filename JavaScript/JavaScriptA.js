// Take a sentence as an input and reverse every word in that sentence.

const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

function reverseWords(sentence) {
  // Splitting sentence to words
  const words = sentence.split(' ');

  // Array to store reversed words
  const reversedWords = [];

  // Iterate and reverse
  for (let i = 0; i < words.length; i++) {
    const word = words[i];
    let reversedWord = '';

    // Reverse the characters
    for (let j = word.length - 1; j >= 0; j--) {
      reversedWord += word[j];
    }

    // Store reversed word to array
    reversedWords.push(reversedWord);
  }

  // Join the reversed words into sentence
  const reversedSentence = reversedWords.join(' ');

  return reversedSentence;
}

// Prompt to the user
rl.question("Please enter a sentence: ", (inputSentence) => {
  const reversedSentence = reverseWords(inputSentence);
  console.log("Reversed Sentence:", reversedSentence);
  rl.close();
});
