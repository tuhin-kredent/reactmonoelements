import { AppRegistry, Platform } from 'react-native';
import { registerRootComponent } from 'expo';
import { activateKeepAwake } from 'expo-keep-awake';
import App from './App';

AppRegistry.registerComponent('stockedgeclub', () => App);

if (Platform.OS === 'web') {
  const rootTag = document.getElementById('root') || document.getElementById('main');
  AppRegistry.runApplication('stockedgeclub', { rootTag });
}

if (__DEV__) {
  activateKeepAwake();
}

registerRootComponent(App);
