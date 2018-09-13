import React, { Component } from 'react';
import logo from '../logo.svg';
import '../App.css';

class Header extends Component {
	state = {
		time: Date(),
		passableState: "I'm the page head"
	};
	
	render() {
		return (
			<div className="header" data-pass={this.state.passableState}>
				<header className="App-header">
					<img src={logo} className="App-logo" alt="logo" />
					<h1 className="App-title">{this.props.pageHeader}{(this.state.passableState)}</h1>
				</header>
			</div>
		);
	}
}

export default Header;

