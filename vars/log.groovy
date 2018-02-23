def info(message) {
	ansiColor('xterm') {
		echo "\033[34m [INFO] ${message} \033[0m"
	}
}

def warning(message) {
	ansiColor('xterm') {
		echo "\033[31m [WARNING] ${message} \033[0m"
	}
}

def error(message) {
	ansiColor('xterm') {
		echo "\033[1;31m [ERROR] ${message} \033[0m"
	}
}

def success(message) {
	ansiColor('xterm') {
		echo "\033[32m [SUCCESS] ${message} \033[0m"
	}
}

def block() {
	echo "========== ========== ========== ========== ========== =========="
}