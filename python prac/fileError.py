def read_file(fileNAme):
    try:
        file=open(fileName, "r")
        contents=file.read()
        print("file content:")
        print(contents)
        file.close()
    except FileNotFoundError:
        print("Error: File Not Found")