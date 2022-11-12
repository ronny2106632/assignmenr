def divisible_by_5(num):
    if num % 5 == 0:
        print(num, "is divisible by 5")
    else:
        print(num, "is not divisible by 5")

def divisible_by_9(num):
    if num % 9 == 0:
        print(num, "is divisible by 9")
    else:
        print(num, "is not divisible by 9")

def main():
    num = int(input("Enter a number: "))
    divisible_by_5(num)
    divisible_by_9(num)

main()
