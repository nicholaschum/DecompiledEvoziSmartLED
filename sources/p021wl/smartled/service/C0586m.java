package p021wl.smartled.service;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;

/* renamed from: wl.smartled.service.m */
final class C0586m extends BluetoothGattCallback {

    /* renamed from: a */
    final /* synthetic */ BluetoothLEService f2665a;

    C0586m(BluetoothLEService bluetoothLEService) {
        this.f2665a = bluetoothLEService;
    }

    public final void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
        bluetoothGattCharacteristic.getValue();
    }

    public final void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
        if (this.f2665a.f2582e != null) {
            this.f2665a.f2582e.mo4746a(bluetoothGatt.getDevice().getAddress(), bluetoothGattCharacteristic.getValue());
        }
    }

    public final void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
    }

    public final void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i, int i2) {
        super.onConnectionStateChange(bluetoothGatt, i, i2);
        String address = bluetoothGatt.getDevice().getAddress();
        if (this.f2665a.f2582e != null) {
            this.f2665a.f2582e.mo4745a(bluetoothGatt.getDevice().getName(), address, BluetoothLEService.m2022b(i2));
        }
        if (i2 == 2) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bluetoothGatt.discoverServices();
        }
    }

    public final void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
    }

    public final void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i) {
        super.onServicesDiscovered(bluetoothGatt, i);
    }
}
