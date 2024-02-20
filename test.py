def generate_string_array(num: int):
    output: list = []
    for i in range(0, num):
        output.append(f"Test{i}")
    return output

if __name__ == '__main__':
    output = generate_string_array(5)
    print(output)