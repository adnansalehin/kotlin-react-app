module.exports = {
	verbose: true,
	setupFiles: [
		'<rootDir>/src/test/setup.js'
	],
	setupTestFrameworkScriptFile: '<rootDir>/src/test/setup.js',
	moduleFileExtensions: [
		"js",
		"jsx"
	],
	moduleDirectories: [
		"node_modules"
	],
	moduleNameMapper: {
		"\\.(css|less)$": "identity-obj-proxy"
	},
	transform: {
		"^.+\\.js$": "babel-jest",
		"^.+\\.jsx$": "babel-jest"
	}
}