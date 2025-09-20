import string

def is_palindrome(phrase):
    cleaned_phrase = ''.join(char.lower() for char in phrase if char.isalnum())
    return cleaned_phrase == cleaned_phrase[::-1]
test_phrases = [
    "Go hanga salami I'm a lasagna hog.",
    "Was it a rat I saw?",
    "Step on no pets",
    "Sit on a potato pan, Otis",
    "Lisa Bonet ate no basil",
    "Satan, oscillate my metallic sonatas",
    "I roamed under it as a tired nude Maori",
    "Rise to vote sir",
    "Dammit, I'm mad!"
]

for phrase in test_phrases:
    print(f"'{phrase}' is a palindrome: {is_palindrome(phrase)}")