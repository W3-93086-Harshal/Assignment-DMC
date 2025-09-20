text = """Python is a high-level, general-purpose programming language. Its design philosophy emphasizes code readability with the use of significant indentation. Python is dynamically typed and garbage-collected. It supports multiple programming paradigms, including structured, object-oriented and functional programming."""

# Convert text to lowercase
text = text.lower()


letter_counts = {}

for char in text:
   
    if char.isalpha():

        letter_counts[char] = letter_counts.get(char, 0) + 1
print(letter_counts)