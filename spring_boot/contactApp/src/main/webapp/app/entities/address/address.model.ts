import { IContact } from 'app/entities/contact/contact.model';

export interface IAddress {
  id?: number;
  houseDetails?: string | null;
  post?: string | null;
  pin?: string | null;
  contact?: IContact | null;
}

export class Address implements IAddress {
  constructor(
    public id?: number,
    public houseDetails?: string | null,
    public post?: string | null,
    public pin?: string | null,
    public contact?: IContact | null
  ) {}
}

export function getAddressIdentifier(address: IAddress): number | undefined {
  return address.id;
}
