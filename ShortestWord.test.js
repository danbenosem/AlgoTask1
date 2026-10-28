
const getShortestWord = require("./ShortestWord");

describe("getShortestWord", () => {
    test("finds the shortest word", () => {
        expect(getShortestWord("hello cat world")).toBe("cat");
    });



    test("splits words separated by commas", () => {
        expect(getShortestWord("hello, a, world")).toBe("a");
    });

    test("allows numbers", () => {
        expect(getShortestWord("hello 12 world")).toBe("12");
    });


    test("returns the first word when lengths tie", () => {
        expect(getShortestWord("dog cat sun")).toBe("dog");
    });


});
