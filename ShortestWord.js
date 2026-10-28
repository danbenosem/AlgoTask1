function getShortestWord(sentence) {
    const words = sentence.split(/[, ]+/);
    let min = Number.MAX_VALUE;
    let shortestWord = "";

    for (const word of words) {
        if (/^[a-zA-Z0-9]+$/.test(word) && word.length < min) {
            min = word.length;
            shortestWord = word;
        }
    }

    return shortestWord;
}

module.exports = getShortestWord;