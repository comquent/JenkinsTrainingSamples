def info(message) {
    echo "\033[34m [INFO] ${message} \033[0m"
}

def warning(message) {
    echo "\033[31m [WARNING] ${message} \033[0m"
}

def error(message) {
    echo "\033[1;31m [ERROR] ${message} \033[0m"
}

def success(message) {
    echo "\033[1;32m [SUCCESS] ${message} \033[0m"
}