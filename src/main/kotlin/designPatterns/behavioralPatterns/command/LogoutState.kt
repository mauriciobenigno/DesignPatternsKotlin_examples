package designPatterns.behavioralPatterns.command

sealed class LogoutState

data object LogoutAndRestart: LogoutState()
data object LogoutAndClose: LogoutState()
